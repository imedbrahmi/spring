package com.fstg.locationvoiture.Services;

import com.fstg.locationvoiture.Entity.User;
import com.fstg.locationvoiture.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User createUser (User user ) {return userRepository.save(user);}

    public List<User> getAllUsers() {return userRepository.findAll();}

    public User getUserById(int id) {return userRepository.findById(id).get();}

    public User UpdateUser(User user) {return userRepository.saveAndFlush(user);}

    public void deleteUserById(int id) {userRepository.deleteById(id);}

}

