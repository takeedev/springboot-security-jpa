package com.tpk.SpringSecurityConnectDB.repository;

import com.tpk.SpringSecurityConnectDB.dao.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDao, Long> {

}
