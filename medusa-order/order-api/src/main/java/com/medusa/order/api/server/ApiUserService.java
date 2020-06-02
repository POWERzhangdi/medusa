package com.medusa.order.api.server;

import com.medusa.common.response.ResponseApiDTO;
import com.medusa.order.api.dto.UserDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface ApiUserService {

    @RequestMapping(value = "/order-server/v1.0.0/userinfo/{userId}", method = RequestMethod.GET)
    ResponseApiDTO<UserDTO> getUserInfo(@PathVariable Long userId);

}
