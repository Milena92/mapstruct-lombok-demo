package com.milena.mapstructlombokdemo.dto;

import lombok.Data;

@Data
public class UserInfoDto {

    private String firstName;
    private String middleName;
    private String lastName;
    private SimpleAddressDto addressDto;

}
