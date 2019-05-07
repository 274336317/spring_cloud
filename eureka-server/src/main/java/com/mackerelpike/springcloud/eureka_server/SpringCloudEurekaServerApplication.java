package com.mackerelpike.springcloud.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringCloudApplication
public class SpringCloudEurekaServerApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(SpringCloudEurekaServerApplication.class, args);
    }
}
