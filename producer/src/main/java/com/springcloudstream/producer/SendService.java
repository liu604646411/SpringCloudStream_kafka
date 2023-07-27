package com.springcloudstream.producer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(MySource.class)
public class SendService {
    @Autowired
    private MySource source;

    public boolean sendAddMsg(String msg) {
        System.out.println("开始发送:" + msg);
        boolean send = source.outputAdd().send(MessageBuilder.withPayload(msg).build());
        System.out.println(send == true ? "发送成功！" : "发送失败!");
        return send;
    }

    public boolean sendDelMsg(String msg) {
        System.out.println("开始发送:" + msg);
        boolean send = source.outputDel().send(MessageBuilder.withPayload(msg).build());
        System.out.println(send == true ? "发送成功！" : "发送失败!");
        return send;
    }

    public boolean sendUpdateMsg(String msg) {
        System.out.println("开始发送:" + msg);
        boolean send = source.outputUpdate().send(MessageBuilder.withPayload(msg).build());
        System.out.println(send == true ? "发送成功！" : "发送失败!");
        return send;
    }
}
