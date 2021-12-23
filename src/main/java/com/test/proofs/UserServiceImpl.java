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

    @Override
    public User findByName (String name) {
        return userRepository.findByName(name);
    }
    @Override
    public User saveOrUpdateUser(User user) { return  userRepository.save(user); }

    @Override
    public void deleteUserById(String id) {
         userRepository.deleteById(id);
    }

}