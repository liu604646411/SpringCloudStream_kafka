package com.springcloudstream.producer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import net.minidev.json.JSONArray;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;

@SpringBootTest
class SendControllerTest {

    @Autowired
    private SendService sendService;

    @Test
    public void sendAddMsg(){
        UserPojo userPojo = new UserPojo("1","小明");
        sendService.sendAddMsg(JSON.toJSONString(userPojo));
    }

    @Test
    public void sendDelMsg(){
        UserPojo userPojo = new UserPojo("2","小红");
        sendService.sendDelMsg(JSON.toJSONString(userPojo));
    }

    @Test
    public void sendUpdateMsg(){
        UserPojo userPojo = new UserPojo("3","小华");
        sendService.sendUpdateMsg(JSON.toJSONString(userPojo));
    }
}