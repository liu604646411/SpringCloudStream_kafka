package com.springcloudstream.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(MySource.class)
public class SendService {
    @Autowired
    private MySource source;

    public void sendAddMsg(String msg) {
        System.out.println("开始发送:" + msg);
        source.outputAdd().send(MessageBuilder.withPayload(msg).build());
        System.out.println("发送成功！");
    }

    public void sendDelMsg(String msg) {
        System.out.println("开始发送:" + msg);
        source.outputDel().send(MessageBuilder.withPayload(msg).build());
        System.out.println("发送成功！");
    }

    public void sendUpdateMsg(String msg) {
        System.out.println("开始发送:" + msg);
        source.outputUpdate().send(MessageBuilder.withPayload(msg).build());
        System.out.println("发送成功！");
    }
}
