package com.tpk.SpringSecurityConnectDB.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.UuidGenerator;

import java.sql.Date;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserDao {

    @Id
    @UuidGenerator
    @Column(name = "user_id")
    private UUID id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "active")
    private boolean active;

    @Column(name = "create_by")
    private String create_by;

    @Column(name = "create_date")
    private Date create_date;

    @ManyToMany()
    @JoinTable(name = "user_role"
            , joinColumns = @JoinColumn(name = "user_id")
            , inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<RoleDao> role;

}
