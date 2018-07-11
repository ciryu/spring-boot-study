package com.developlee.j2eespingboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @author Lee
 * @// TODO 2018/7/11-10:21
 * @description
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) { //注册stomp节点，并映射到指定url
        registry.addEndpoint("/endpoint").withSockJS(); //注册一个节点，指定使用sockJS协议
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) { //配置消息代理
        registry.enableSimpleBroker("/topic"); //广播式应配置一个/topic消息代理
        registry.enableSimpleBroker("/queue","/topic");//增加点对点式的/queue消息代理
    }
}
