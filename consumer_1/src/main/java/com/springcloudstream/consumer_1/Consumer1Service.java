package com.springcloudstream.consumer_1;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class Consumer1Service {
    @StreamListener(Sink.INPUT)
    public void recieve(Object payload) {
        System.out.println("Consumer1Service:" + payload);
    }
}
