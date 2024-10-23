package com.fstg.locationvoiture.Repository;

import com.fstg.locationvoiture.Entity.Customer;
import com.fstg.locationvoiture.Entity.Orederr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {




}
