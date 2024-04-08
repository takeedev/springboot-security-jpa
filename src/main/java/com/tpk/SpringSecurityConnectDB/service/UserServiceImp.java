package com.tpk.SpringSecurityConnectDB.service;

import com.tpk.SpringSecurityConnectDB.dao.RoleDao;
import com.tpk.SpringSecurityConnectDB.dao.UserDao;
import com.tpk.SpringSecurityConnectDB.enums.RoleEnum;
import com.tpk.SpringSecurityConnectDB.repository.RoleRepository;
import com.tpk.SpringSecurityConnectDB.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImp implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;

    @Override
    public UserDao createUser(UserDao userDao) {
        return userRepository.save(userDao);
    }

    @Override
    public RoleDao findByName(RoleEnum name) {
        return roleRepository.findByName(name).orElseThrow(() -> new RuntimeException("error"));
    }

}
