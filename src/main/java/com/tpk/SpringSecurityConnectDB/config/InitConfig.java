package com.tpk.SpringSecurityConnectDB.config;

import com.tpk.SpringSecurityConnectDB.dao.RoleDao;
import com.tpk.SpringSecurityConnectDB.enums.RoleEnum;
import com.tpk.SpringSecurityConnectDB.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Configuration
@AllArgsConstructor
public class InitConfig {

    private final RoleRepository roleRepository;

    private Set<RoleDao> prepareData() {
        Set<RoleDao> data = new HashSet<>();
        RoleDao role1 = new RoleDao();
        role1.setName(RoleEnum.ADMIN);
        RoleDao role2 = new RoleDao();
        role2.setName(RoleEnum.USER);
        data.add(role1);
        data.add(role2);
        return data;
    }

    public void insertTableRole() {
        List<RoleDao> result = checkDataInTableRole();
        if (result.isEmpty()) {
            roleRepository.saveAll(prepareData());
        }
    }

    private List<RoleDao> checkDataInTableRole() {
        return roleRepository.findAll();
    }

}
