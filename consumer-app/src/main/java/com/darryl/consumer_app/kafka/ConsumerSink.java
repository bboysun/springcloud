package com.darryl.consumer_app.kafka;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Author: darrylsun
 * @Description: kafka inputs channel
 * @Date: 2021/01/29
 */
public interface ConsumerSink {

    @Input("consumerSink")
    SubscribableChannel consumerSink();
}
