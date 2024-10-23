package com.fstg.locationvoiture.Services;

import com.fstg.locationvoiture.Entity.Customer;
import com.fstg.locationvoiture.Entity.User;
import com.fstg.locationvoiture.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired

    private CustomerRepository customerRepository;

    public Customer createCustomer   (Customer customer ) {return customerRepository.save(customer);}

    public List<Customer> getAllCustomers() {return customerRepository.findAll();}

    public Customer getCustomerById(int id) { return customerRepository.findById(id).get();}

    public void deleteCustomerById(int id) {  customerRepository.deleteById(id);}

    public Customer UpdateCustomer(Customer customer) {return customerRepository.saveAndFlush(customer);}





}

