package com.springcloudstream.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(Source.class)
public class SendService {
    @Autowired
    private Source source;

    public void sendMsg(String msg) {
        System.out.println("开始发送:" + msg);
        source.output().send(MessageBuilder.withPayload(msg).build());
        System.out.println("发送成功！");
    }
}
