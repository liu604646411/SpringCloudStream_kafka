package com.springcloudstream.consumer_1;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(MySink.class)
public class Consumer1Service {
    @StreamListener(MySink.INPUT_ADD)
    public void syncBillAdd(Object payload) {
        System.out.println("Consumer1Service:" + payload);
    }

    @StreamListener(MySink.INPUT_DEL)
    public void syncBillDel(Object payload) {
        System.out.println("Consumer1Service:" + payload);
    }
}
