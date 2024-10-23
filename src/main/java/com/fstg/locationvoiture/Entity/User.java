package com.fstg.locationvoiture.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

@FieldDefaults(level = AccessLevel.PRIVATE)
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "salary")
    double salary;
    @Column(name = "phone")
    int phone;
    @Column(name = "age")
    int age;
    @Column(name = "email")
    String email;
    @Column(name = "password")
    String password;
}