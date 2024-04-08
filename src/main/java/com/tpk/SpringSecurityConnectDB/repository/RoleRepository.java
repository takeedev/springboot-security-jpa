package com.tpk.SpringSecurityConnectDB.repository;

import com.tpk.SpringSecurityConnectDB.dao.RoleDao;
import com.tpk.SpringSecurityConnectDB.enums.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleDao, Long> {

    Optional<RoleDao> findByName(RoleEnum roleName);

}
