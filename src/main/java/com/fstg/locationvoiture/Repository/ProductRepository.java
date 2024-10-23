package com.fstg.locationvoiture.Repository;

import com.fstg.locationvoiture.Entity.Category;
import com.fstg.locationvoiture.Entity.Product;
import com.fstg.locationvoiture.Entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {


}
