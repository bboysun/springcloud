package com.darryl.producer_app.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @Author: darrylsun
 * @Description: kafka producer 发布消息
 * @Date: 2021/01/29
 */
@EnableBinding(ProducerSource.class)
public class KafkaSender {

    @Autowired
    private ProducerSource source;

    /**
     * 发送消息
     * @param msg
     */
    public void sendMsg(String msg) {
        source.producerSource().send(MessageBuilder.withPayload(msg).build());
    }

}
