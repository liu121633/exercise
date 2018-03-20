package com.example.websocket.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebSocket {
    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    public WebSocket(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @ResponseBody
    @RequestMapping("ts/{msg}")
    public String ts(@PathVariable("msg") String msg) {
        messagingTemplate.convertAndSend("/topic/callback", msg);
        return "发送成功!";
    }
}
