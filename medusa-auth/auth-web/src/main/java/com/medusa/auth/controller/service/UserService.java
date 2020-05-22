package com.medusa.auth.controller.service;

import com.medusa.auth.api.dto.UserDTO;
import com.medusa.auth.api.service.IUserService;
import com.medusa.auth.controller.vo.UserWebVO;
import com.medusa.common.response.ResponseApiDTO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Reference(interfaceClass = IUserService.class, version = "0.0.1")
    private IUserService iUserService;


    public UserWebVO findByUserId(Long userId) {
        ResponseApiDTO<UserDTO> responseApiDTO = iUserService.findByUserId(userId);
        if (responseApiDTO.getCode() != 200) {
            return null;
        }
        UserDTO userDTO = responseApiDTO.getData();
        UserWebVO userWebVO = new UserWebVO();
        userWebVO.setUserId(userDTO.getUserId());
        userWebVO.setName(userDTO.getName());
        userWebVO.setUrl(userDTO.getUrl());
        return userWebVO;
    }
}
