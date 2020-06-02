package com.medusa.order.server.manager;

import com.medusa.common.response.ResponseApiDTO;
import com.medusa.order.api.dto.UserDTO;
import com.medusa.order.api.server.ApiUserService;
import com.medusa.order.server.entity.MedusaUser;
import com.medusa.order.server.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
public class UserManager implements ApiUserService {

    @Resource
    private UserService userService;

    @Override
    public ResponseApiDTO<UserDTO> getUserInfo(Long userId) {
        Optional<MedusaUser> user =  userService.findByUserId(userId);
        if(!user.isPresent()){
            return ResponseApiDTO.FAILURE("用户不存在");
        }
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.get().getId());
        userDTO.setName(user.get().getName());
        userDTO.setUrl(user.get().getUrl());
        return ResponseApiDTO.SUCCESS(userDTO);
    }
}
