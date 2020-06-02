package com.medusa.order.web.fallback;

import com.medusa.common.response.ResponseApiDTO;
import com.medusa.order.api.dto.UserDTO;
import com.medusa.order.web.serivce.ApiFeignUserService;
import org.springframework.stereotype.Component;

@Component
public class ApiFeignFallBack implements ApiFeignUserService {

    @Override
    public ResponseApiDTO<UserDTO> getUserInfo(Long userId) {
        return ResponseApiDTO.FAILURE("获取用户信息服务失败");
    }
}
