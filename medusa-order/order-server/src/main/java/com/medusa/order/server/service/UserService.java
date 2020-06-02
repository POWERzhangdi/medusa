package com.medusa.order.server.service;

import com.medusa.order.server.dao.UserDao;
import com.medusa.order.server.entity.MedusaUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public Optional<MedusaUser> findByUserId(Long userId) {
        return userDao.findById(userId);
    }

}
