package com.medusa.auth.web.controller;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @program: medusa
 * @description: 账户项目启动类
 * @author: PowerZzzD
 * @date: 2019/04/16 10:27
 */

@SpringBootApplication
public class AuthWebApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AuthWebApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
