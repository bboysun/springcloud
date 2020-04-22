package com.darryl.gateway.fallback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: Darryl
 * @Description: 服务提供者的服务，提供的回退功能
 * @Date: 2020/04/22
 */
@Component
public class ProducerAppFallBack implements FallbackProvider {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	// 这里返回的route名称，而不是服务名称
	@Override
	public String getRoute() {
		return "producer-a";
	}

	@Override
	public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
		// 返回一个http response
		return new ClientHttpResponse() {
			// 返回一个状态码相关信息
			@Override
			public HttpStatus getStatusCode() throws IOException {
				return HttpStatus.BAD_REQUEST;
			}
			@Override
			public int getRawStatusCode() throws IOException {
				return HttpStatus.BAD_REQUEST.value();
			}
			@Override
			public String getStatusText() throws IOException {
				return HttpStatus.BAD_REQUEST.getReasonPhrase();
			}
			@Override
			public void close() {

			}
			// 返回response body
			@Override
			public InputStream getBody() throws IOException {
				log.info("zuul gateway降级处理");
				return new ByteArrayInputStream(("producer-a server fallback: " + ProducerAppFallBack.this.getRoute()).getBytes());
			}
			// 返回headers
			@Override
			public HttpHeaders getHeaders() {
				HttpHeaders headers = new HttpHeaders();
				headers.setContentType(MediaType.APPLICATION_JSON);
				return headers;
			}
		};
	}
}
