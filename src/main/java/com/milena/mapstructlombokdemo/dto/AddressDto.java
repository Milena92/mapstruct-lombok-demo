package com.milena.mapstructlombokdemo.dto;

import lombok.Data;

@Data
public class AddressDto {

    private String userId;
    private String addressType;
    private String street;
    private String houseNumber;
    private String postcode;
    private String cityName;
    private String country;

}
