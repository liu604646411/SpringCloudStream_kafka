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

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public void sendAddMsg(@RequestParam String msg){
        sendService.sendAddMsg(msg);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/del")
    public void sendDelMsg(@RequestParam String msg){
        sendService.sendDelMsg(msg);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/update")
    public void sendUpdateMsg(@RequestParam String msg){
        sendService.sendUpdateMsg(msg);
    }
}
