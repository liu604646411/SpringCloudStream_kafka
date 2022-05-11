package com.springcloudstream.producer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SendControllerTest {

    @Autowired
    private SendService sendService;

    @Test
    public void sendAddMsg(){
        sendService.sendAddMsg("add");
    }

    @Test
    public void sendDelMsg(){
        sendService.sendDelMsg("delete");
    }

    @Test
    public void sendUpdateMsg(){
        sendService.sendUpdateMsg("update");
    }
}