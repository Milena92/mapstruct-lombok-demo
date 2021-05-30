package com.milena.mapstructlombokdemo.service;

import com.milena.mapstructlombokdemo.dto.AddressDto;
import com.milena.mapstructlombokdemo.dto.DeliveryAddressDto;
import com.milena.mapstructlombokdemo.dto.UserDto;
import com.milena.mapstructlombokdemo.dto.UserInfoDto;
import com.milena.mapstructlombokdemo.enumeration.AddressType;

public interface UserService {

    UserDto createUser(UserDto userDto);

    DeliveryAddressDto getDeliveryAddress(String userId, AddressType deliveryAddress);

    UserInfoDto addAddress(AddressDto addressDto);
}
