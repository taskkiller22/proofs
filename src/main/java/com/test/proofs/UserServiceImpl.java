package com.test.proofs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public abstract class UserServiceImpl implements UserService{




    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findByUsername (String username) {
        return userRepository.findByUsername(username);
    }


}