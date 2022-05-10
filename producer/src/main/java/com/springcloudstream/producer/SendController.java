package com.springcloudstream.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send")
public class SendController {

    @Autowired
    private SendService sendService;

    @RequestMapping(method = RequestMethod.GET, value = "/msg")
    public void Send(@RequestParam String msg){
        sendService.sendMsg(msg);
    }
}
