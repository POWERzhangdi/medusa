package com.medusa.auth.server.service;


import com.medusa.auth.server.dao.UserDao;
import com.medusa.auth.server.entity.MedusaUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Slf4j
@Service
public class UserService {

    @Resource
    private UserDao userDao;


    public Optional<MedusaUser> findByUserId(Long userId) {
        Optional<MedusaUser> optional = userDao.findById(userId);
        return optional;
    }


}
