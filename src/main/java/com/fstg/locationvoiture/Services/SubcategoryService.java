package com.fstg.locationvoiture.Services;

import com.fstg.locationvoiture.Entity.Subcategory;
import com.fstg.locationvoiture.Repository.SubcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubcategoryService {

    @Autowired
    private SubcategoryRepository subcategoryRepository;
    public List<Subcategory> getAllSubcategories() {return subcategoryRepository.findAll();}
    public Subcategory getSubcategoryById(int id) {return subcategoryRepository.findById(id).get();}
    public Subcategory saveSubcategory(Subcategory subcategory) {return subcategoryRepository.save(subcategory);}
    public void deleteSubcategoryById(int id) {subcategoryRepository.deleteById(id);}
    public Subcategory updteSubcategory(Subcategory subcategory) {return subcategoryRepository.saveAndFlush(subcategory);}
}
