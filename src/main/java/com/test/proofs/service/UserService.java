package com.test.proofs.service;

import com.test.proofs.model.User;
import com.test.proofs.repository.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private UserRepository userRepository;


    public List<User> getAllUsers() {

        return userRepository.findAll();

    }

    public User insert(User user) {
        return  userRepository.insert(user);
    }

    public Optional<User> getUsersById(String id){
        return userRepository.findById(id);
    }

    public String  deleteById(String id){
        userRepository.deleteById(id);
        return id;
    }

}
