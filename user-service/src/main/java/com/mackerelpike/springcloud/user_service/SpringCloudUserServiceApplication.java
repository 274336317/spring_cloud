package com.mackerelpike.springcloud.user_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mackerelpike.springcloud.user_service.mapper")
public class SpringCloudUserServiceApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(SpringCloudUserServiceApplication.class, args);
    }
}
