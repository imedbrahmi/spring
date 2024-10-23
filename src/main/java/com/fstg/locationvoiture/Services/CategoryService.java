package com.fstg.locationvoiture.Services;

import com.fstg.locationvoiture.Entity.Category;
import com.fstg.locationvoiture.Entity.User;
import com.fstg.locationvoiture.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
  @Autowired
    private CategoryRepository categoryRepository;

  public Category createUser (Category category ) {return categoryRepository.save(category);}

  public List<Category> getAllCategory() {return categoryRepository.findAll();}

  public Category getCategoryById(int id) {return categoryRepository.findById(id).get();}

  public Category UpdateCategory(Category category) {return categoryRepository.saveAndFlush(category);}

  public void deleteCategoryById(int id) {categoryRepository.deleteById(id);}
}


