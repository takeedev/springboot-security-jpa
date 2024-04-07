package com.tpk.SpringSecurityConnectDB.dto;

import lombok.Builder;

import java.sql.Date;

@Builder
public record UserDto(
        String username ,
        String password ,
        boolean active ,
        String create_by ,
        Date Create_date ,
        String role
) {
}
