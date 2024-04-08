package com.tpk.SpringSecurityConnectDB.service;

import com.tpk.SpringSecurityConnectDB.dao.RoleDao;
import com.tpk.SpringSecurityConnectDB.dao.UserDao;
import com.tpk.SpringSecurityConnectDB.enums.RoleEnum;

public interface UserService {

    UserDao createUser(UserDao userDao);

    RoleDao findByName(RoleEnum name);


}
