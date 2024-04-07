package com.tpk.SpringSecurityConnectDB.service;

import com.tpk.SpringSecurityConnectDB.dao.UserDao;

public interface UserService {

    UserDao createUser(UserDao userDao);

}
