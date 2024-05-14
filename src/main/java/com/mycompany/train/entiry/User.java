package com.mycompany.train.entiry;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = true)
    private String username;

    @Column(name = "password", nullable = true)
    private String password;

    @Column(name = "email", nullable = true)
    private String email;

    @Column(name = "enabled")
    private boolean enabled;

}
