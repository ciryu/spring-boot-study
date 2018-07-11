package com.developlee.j2eespingboot.controller;

import com.developlee.j2eespingboot.message.WiselyMessage;
import com.developlee.j2eespingboot.message.WiselyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * @author Lee
 * @// TODO 2018/7/11-10:41
 * @description  广播式webSocket
 */
@Controller
@MessageMapping("/welcome")
@SendTo("/topic/getResponse")
public class WiselyController {

    //广播式
    public WiselyResponse say(WiselyMessage message) throws InterruptedException {
        Thread.sleep(3600);
        return new WiselyResponse("Welcome to " + message.getName() + "!");
    }

    //点对点式
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate; //通过SimpMessagingTemplate 向浏览器发送消息

    @MessageMapping("/chat")
    public void handleChat(Principal principal, String msg){
        if(principal.getName().equals("wisely")){
            //指定接收消息的用户，浏览器订阅地址，消息本身
            simpMessagingTemplate.convertAndSendToUser("wisely", "/queue/notifications", principal.getName() + "-send:" + msg);
        }else {
            simpMessagingTemplate.convertAndSendToUser("wfy","/queue/notifications", principal.getName() + "-send:" + msg);
        }
    }
}
