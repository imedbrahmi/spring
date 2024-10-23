package com.fstg.locationvoiture.Entity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "descreption")
    String descreption;
    @Column(name = "price")
    double price;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Subcategory> posts = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "Provider_id")
    private  Provider provider;

    @ManyToMany(mappedBy = "products", cascade = CascadeType.ALL)
    private Set<Orederr> orders = new HashSet<>();

    public void addAttribute(String productFomr, Product p) {
    }
}
