package com.fstg.locationvoiture.Repository;

import com.fstg.locationvoiture.Entity.Category;
import com.fstg.locationvoiture.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {






}
