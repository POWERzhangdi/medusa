package com.medusa.auth.server.dao;

import com.medusa.auth.server.entity.MedusaUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<MedusaUser,Long> {

}
