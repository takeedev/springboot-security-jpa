package com.tpk.SpringSecurityConnectDB.repository;

import com.tpk.SpringSecurityConnectDB.dao.RoleDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleDao, Long> {

}
