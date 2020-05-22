package com.medusa.auth.controller.login;

import com.medusa.auth.controller.service.UserService;
import com.medusa.auth.controller.vo.UserWebVO;
import com.medusa.common.response.ResponseWebDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: medusa
 * @description: 登陆接口
 * @author: PowerZzzD
 * @date: 2019/04/16 10:12
 */
@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Resource
    private UserService userService;

    @GetMapping(value = "/user/info/{userId}")
    public ResponseWebDTO<UserWebVO> getUserInfo(@PathVariable Long userId) {
        return ResponseWebDTO.SUCCESS(userService.findByUserId(userId));
    }


}
