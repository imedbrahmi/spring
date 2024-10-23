package com.fstg.locationvoiture.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Orederr {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name = "ref")
    String ref;
    @Column(name = "price")
    double price;
    @Column(name = "date")
    String date;

    @ManyToOne
    @JoinColumn(name = "Customer_id")
    private  Customer customer;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Order_Product",
            joinColumns = @JoinColumn(name = "Order_id"),
            inverseJoinColumns = @JoinColumn(name = "Product_id")
    )
    private List<Product> products = new ArrayList<>();

}
