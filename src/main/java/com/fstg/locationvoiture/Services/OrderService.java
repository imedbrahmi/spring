package com.fstg.locationvoiture.Services;

import com.fstg.locationvoiture.Entity.Orederr;
import com.fstg.locationvoiture.Repository.OrederrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrederrRepository orederrRepository;

    public List<Orederr> getAllOrders() {return orederrRepository.findAll();}

    public Orederr createOrder(Orederr orederr) {return orederrRepository.save(orederr);}

    public  void deleteOrder(int id) { orederrRepository.deleteById(id);}

    public Orederr getOrederrById(int id) {return orederrRepository.getById(id);}

    public Orederr updateOrder(Orederr orederr) {return orederrRepository.saveAndFlush(orederr);}


}
