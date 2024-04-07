package com.tpk.SpringSecurityConnectDB.repository;

import com.tpk.SpringSecurityConnectDB.dao.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserDao, Long> {

    Optional<UserDao> findByUsername(String username);

}
