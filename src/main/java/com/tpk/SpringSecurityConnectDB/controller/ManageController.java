package com.tpk.SpringSecurityConnectDB.controller;

import com.tpk.SpringSecurityConnectDB.dao.RoleDao;
import com.tpk.SpringSecurityConnectDB.dao.UserDao;
import com.tpk.SpringSecurityConnectDB.dto.UserDto;
import com.tpk.SpringSecurityConnectDB.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.relation.Role;
import java.util.HashSet;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ManageController {

    private final PasswordEncoder passwordEncoder;

    private final UserService userService;

    @PostMapping("/addUser")
    private UserDao addUser(@RequestBody UserDto userDto) {
        Set<RoleDao> setRole = new HashSet<>();
        RoleDao roleDao = new RoleDao();
        roleDao.setRole_name(userDto.role());
        setRole.add(roleDao);

        UserDao userDao = new UserDao();
        userDao.setUsername(userDto.username());
        userDao.setPassword(passwordEncoder.encode(userDto.password()));
        userDao.setActive(userDto.active());
        userDao.setCreate_by(userDto.create_by());
        userDao.setCreate_date(userDto.Create_date());
        roleDao.setRole_name(setRole.toString());

        return userService.createUser(userDao);
    }

}
