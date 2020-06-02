package com.medusa.order.server.dao;

import com.medusa.order.server.entity.MedusaUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<MedusaUser,Long> {

}
