package com.medusa.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GateWayApplication {

    public static void main(String[] args) {
        //这样写即可 默认非web响应
        SpringApplication.run(GateWayApplication.class, args);
//        new SpringApplicationBuilder(GateWayApplication.class)
//                .web(WebApplicationType.REACTIVE)
//                .run(args);
    }

}
