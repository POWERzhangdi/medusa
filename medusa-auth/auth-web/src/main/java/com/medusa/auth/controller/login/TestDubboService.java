package com.medusa.auth.controller.login;

import org.apache.dubbo.config.annotation.Service;

/**
 * @program: medusa
 * @description: 测试dubbo
 * @author: daitu
 * @date: 2019/05/20 17:26
 */

@Service(version = "1.0.0")
public class TestDubboService {

    public void sayHello(){
        System.out.println("测试dubbo");
    }

}
