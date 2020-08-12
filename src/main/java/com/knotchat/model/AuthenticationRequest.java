package com.knotchat.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationRequest {

    private String username;
    private String phoneNumber;
    private String password;
    private String signature;
    private PhoneInfo phoneInfo;

}

