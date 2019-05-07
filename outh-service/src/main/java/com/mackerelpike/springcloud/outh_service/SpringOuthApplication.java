package com.mackerelpike.springcloud.outh_service;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringCloudApplication
@EnableAuthorizationServer
@EnableFeignClients("com.mackerelpike.client")

public class SpringOuthApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(SpringOuthApplication.class, args);
    }
}
