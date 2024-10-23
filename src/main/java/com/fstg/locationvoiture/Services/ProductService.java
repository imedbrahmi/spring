package com.fstg.locationvoiture.Services;

import com.fstg.locationvoiture.Entity.Product;
import com.fstg.locationvoiture.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> findAll() {return productRepository.findAll();}

    public Product findById(int id) {return productRepository.findById(id).get();}

    public Product save(Product product) {return productRepository.save(product);}

    public Product update(Product product) {return productRepository.saveAndFlush(product);}

    public void delete(Product product) {productRepository.delete(product);}

}
