package com.fstg.locationvoiture.Repository;

import com.fstg.locationvoiture.Entity.Subcategory;
import com.fstg.locationvoiture.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SubcategoryRepository extends JpaRepository<Subcategory, Integer> {


}
