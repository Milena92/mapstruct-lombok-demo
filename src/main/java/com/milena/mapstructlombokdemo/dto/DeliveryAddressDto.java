package com.milena.mapstructlombokdemo.dto;

import lombok.Data;

import java.util.List;

@Data
public class DeliveryAddressDto {

    private String firstName;
    private String lastName;
    private List<SimpleAddressDto> deliveryAddressList;

}
