package com.springcloudstream.consumer_2;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(MySink.class)
public class Consumer2Service {

    @StreamListener(MySink.INPUT_UPDATE)
    public void recieve(Object payload) {
        System.out.println("Consumer2Service:" + payload);
    }
}
