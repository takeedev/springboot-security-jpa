package com.tpk.SpringSecurityConnectDB.dao;

import com.tpk.SpringSecurityConnectDB.enums.RoleEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "roles")
public class RoleDao {

    @Id
    @UuidGenerator
    @Column(name = "role_id")
    private UUID role_id;

    @Column(name = "name")
    @Enumerated(EnumType.STRING)
    private RoleEnum name;

}
