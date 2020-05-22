package com.medusa.auth.server;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableDubbo
@EnableDubboConfig
@SpringBootApplication
public class AuthServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AuthServerApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }

}
