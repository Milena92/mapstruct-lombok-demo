package com.milena.mapstructlombokdemo.dto;

import lombok.Data;

@Data
public class UserDto {

    private String id;
    private String name;
    private String middleName;
    private String surname;
    private Integer age;
}
