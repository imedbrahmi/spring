package com.fstg.locationvoiture.Services;

import com.fstg.locationvoiture.Entity.Provider;
import com.fstg.locationvoiture.Repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderService {
    @Autowired

    private ProviderRepository providerRepository;

    public List<Provider> getAllProviders() {return providerRepository.findAll();}

    public Provider getProviderById(int id) {return providerRepository.findById(id).get();}
    public Provider save(Provider provider) {return providerRepository.save(provider);}

    public void deleteProviderById(int id) {providerRepository.deleteById(id);}
}
