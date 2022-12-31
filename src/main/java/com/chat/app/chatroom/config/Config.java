package com.chat.app.chatroom.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
public class Config implements WebSocketMessageBrokerConfigurer{

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // TODO Auto-generated method stub
        registry.enableSimpleBroker("/topic");
        registry.setApplicationDestinationPrefixes("/app");

    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // TODO Auto-generated method stub

        registry.addEndpoint("/server1").setAllowedOrigins("*")
        .withSockJS();


    }
    
}


//To connect with server: /server1
//To send message: /app/message
//To subscribe so that we can receive message: /topic/return-to