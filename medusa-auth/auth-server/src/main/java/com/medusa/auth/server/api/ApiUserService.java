package com.medusa.auth.server.api;

import com.medusa.auth.api.dto.UserDTO;
import com.medusa.auth.api.service.IUserService;
import com.medusa.auth.server.entity.MedusaUser;
import com.medusa.auth.server.service.UserService;
import com.medusa.common.response.ResponseApiDTO;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service(interfaceClass = IUserService.class, version = "0.0.1")
public class ApiUserService implements IUserService {

    @Resource
    private UserService userService;

    @Override
    public ResponseApiDTO<UserDTO> findByUserId(Long userId) {
        if (null == userId || userId == 0) {
            return ResponseApiDTO.FAILURE("userId不能为空或者0");
        }
        Optional<MedusaUser> optional = userService.findByUserId(userId);
        if (!optional.isPresent()) {
            return ResponseApiDTO.FAILURE("查询不到此用户信息");
        }
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(optional.get().getId());
        userDTO.setName(optional.get().getName());
        userDTO.setUrl(optional.get().getUrl());
        return ResponseApiDTO.SUCCESS(userDTO);
    }
}
