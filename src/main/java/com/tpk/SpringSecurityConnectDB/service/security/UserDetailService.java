package com.tpk.SpringSecurityConnectDB.service.security;

import com.tpk.SpringSecurityConnectDB.dao.UserDao;
import com.tpk.SpringSecurityConnectDB.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserDao> result = userRepository.findByUsername(username);
        if (result.isPresent()) {
            var user = result.get();
            var role = user.getRole();
            return User.builder()
                    .username(user.getUsername())
                    .password(user.getPassword())
                    .roles(role.getClass().getName())
                    .build();
        } else {
            throw new UsernameNotFoundException(username);
        }

    }
}
