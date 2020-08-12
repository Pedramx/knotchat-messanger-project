package com.knotchat.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhoneInfo {
    /*
    we need phone information to have more secure registration and login
     */
    private String board;
    private String brand;
    private String device;
    private String display;
    private String model;
    private String product;

}
