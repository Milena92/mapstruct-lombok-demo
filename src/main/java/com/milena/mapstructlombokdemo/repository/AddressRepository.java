package com.milena.mapstructlombokdemo.repository;

import com.milena.mapstructlombokdemo.entity.Address;
import com.milena.mapstructlombokdemo.enumeration.AddressType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {

    List<Address> findAllByUserIdAndAddressType(UUID userId, AddressType addressType);
}
