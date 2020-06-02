package com.medusa.order.web.controller;

import com.medusa.common.response.ResponseApiDTO;
import com.medusa.common.response.ResponseWebDTO;
import com.medusa.order.api.dto.UserDTO;
import com.medusa.order.api.server.ApiUserService;
import com.medusa.order.web.serivce.ApiFeignUserService;
import com.medusa.order.web.vo.UserVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private ApiFeignUserService apiFeignUserService;


    @GetMapping(value = "/v1.0.0/info/{userId}")
    public ResponseWebDTO<UserVO> getUserInfo(@PathVariable Long userId) {
        ResponseApiDTO<UserDTO> responseApiDTO = apiFeignUserService.getUserInfo(userId);
        if (responseApiDTO.getCode() != 200) {
            return ResponseWebDTO.FAILURE("服务异常");
        }
        UserDTO userDTO = responseApiDTO.getData();
        UserVO userVO = new UserVO();
        userVO.setName(userDTO.getName());
        userVO.setUrl(userDTO.getUrl());
        userVO.setUserId(userDTO.getUserId());
        return ResponseWebDTO.SUCCESS(userVO);
    }


}
