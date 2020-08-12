package com.knotchat.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String password;
    private boolean active;
    private String roles;
    @Column(name = "public_key")
    private String publicKey;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "country_code")
    private String countryCode;
}
