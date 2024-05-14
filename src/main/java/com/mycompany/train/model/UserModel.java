package com.mycompany.train.model;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "usersxxx")
public class UserModel implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "enabled")
    private boolean enabled;

}
