package com.milena.mapstructlombokdemo.controller;

import com.milena.mapstructlombokdemo.dto.AddressDto;
import com.milena.mapstructlombokdemo.dto.DeliveryAddressDto;
import com.milena.mapstructlombokdemo.dto.UserDto;
import com.milena.mapstructlombokdemo.dto.UserInfoDto;
import com.milena.mapstructlombokdemo.enumeration.AddressType;
import com.milena.mapstructlombokdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(userService.createUser(userDto));
    }

    @PostMapping("/address")
    public ResponseEntity<UserInfoDto> addAddress(@RequestBody AddressDto addressDto) {
        return ResponseEntity.ok(userService.addAddress(addressDto));
    }

    @GetMapping("/{userId}/address")
    public ResponseEntity<DeliveryAddressDto> getDeliveryAddress(@PathVariable String userId) {
        return ResponseEntity.ok(userService.getDeliveryAddress(userId, AddressType.DELIVERY_ADDRESS));
    }

}
