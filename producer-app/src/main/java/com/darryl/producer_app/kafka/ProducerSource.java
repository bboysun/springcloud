package com.darryl.producer_app.kafka;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @Author: darrylsun
 * @Description: producer app source
 * @Date: 2021/01/29
 */
public interface ProducerSource {

    //管道名称为producerSource,对应在yml文件里
    @Output("producerSource")
    MessageChannel producerSource();
}
