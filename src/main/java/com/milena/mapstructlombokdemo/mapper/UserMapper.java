package com.milena.mapstructlombokdemo.mapper;

import com.milena.mapstructlombokdemo.dto.UserDto;
import com.milena.mapstructlombokdemo.dto.UserInfoDto;
import com.milena.mapstructlombokdemo.entity.Address;
import com.milena.mapstructlombokdemo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = AddressMapper.class)
public interface UserMapper {

    @Mapping(source = "firstName", target = "name")
    @Mapping(source = "lastName", target = "surname")
    UserDto toUserDto(User user);

    @Mapping(target = "id", ignore = true)
    @Mapping(source = "name", target = "firstName")
    @Mapping(source = "surname", target = "lastName")
    User toUser(UserDto userDto);

    @Mapping(source = "address", target = "addressDto")
    UserInfoDto toUserInfoDto(User user, Address address);
}
