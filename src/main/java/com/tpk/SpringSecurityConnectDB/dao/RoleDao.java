package com.tpk.SpringSecurityConnectDB.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.Set;
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

    @Column(name = "role_name")
    private String role_name;

    @ManyToMany(mappedBy = "role")
    private Set<UserDao> user;

}
