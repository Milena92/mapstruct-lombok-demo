package com.milena.mapstructlombokdemo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Integer age;
    @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST})
    private Set<Address> address;
}
