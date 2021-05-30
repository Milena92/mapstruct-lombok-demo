package com.milena.mapstructlombokdemo.entity;

import com.milena.mapstructlombokdemo.enumeration.AddressType;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Enumerated(EnumType.STRING)
    private AddressType addressType;
    private String street;
    private Integer houseNumber;
    private String postcode;
    private String cityName;
    private String country;
    @ManyToOne
    private User user;
}
