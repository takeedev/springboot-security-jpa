package com.tpk.SpringSecurityConnectDB.service;

import com.tpk.SpringSecurityConnectDB.dao.UserDao;
import com.tpk.SpringSecurityConnectDB.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImp implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDao createUser(UserDao userDao) {
        return userRepository.save(userDao);
    }
}
