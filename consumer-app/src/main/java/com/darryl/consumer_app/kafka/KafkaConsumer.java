package com.darryl.consumer_app.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @Author: darrylsun
 * @Description: kafka consumer
 * @Date: 2021/01/29
 */
@EnableBinding(ConsumerSink.class)
public class KafkaConsumer {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @StreamListener("consumerSink")
    public void recieve(Object payload){
        logger.info("接受到的消息为：{}", payload);
    }
}
