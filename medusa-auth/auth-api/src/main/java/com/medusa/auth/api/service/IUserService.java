package com.medusa.auth.api.service;

import com.medusa.auth.api.dto.UserDTO;
import com.medusa.common.response.ResponseApiDTO;


public interface IUserService {

    ResponseApiDTO<UserDTO> findByUserId(Long userId);

}
