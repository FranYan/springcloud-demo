package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping("/")
@RefreshScope
public class Demo1Application {

    @Value("${user.name: test}")
    private String username;

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Demo1Application.class, args);
        String username = applicationContext.getEnvironment().getProperty("user.name");
        String userage = applicationContext.getEnvironment().getProperty("user.age");
        System.err.println(username + ":" + userage);
    }


    @RequestMapping("/test")
    public String test() {
        return username;
    }

}
