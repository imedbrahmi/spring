package com.fstg.locationvoiture.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name = "titre")
    String titre;
    @Column(name = "descreption")
    String descreption;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private  Category category;

    @ManyToOne
    @JoinColumn(name = "Produc_id")
    private  Product product;


}
