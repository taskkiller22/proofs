package com.test.proofs;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public void createUser(@NotNull User user){
        userRepository.save(new User(user.getName(), user.getName(), user.getLastName(), user.getNumber(), user.getAddress()));
    }


    public void deleteUserByID (String id){

        userRepository.deleteById(id);
    }


    public void updateUser (User User){
        userRepository.save(User);
    }


    public List<User> getAllUsersByName(String name){

        return  userRepository.findByName(name);
    }


    public List<User> getAllUsersByUsername(String username){

        return  userRepository.findByUsername(username);
    }


    public List<User> getAllUsersById(User id){

        return  userRepository.findById(id);
    }


    public List<User> getAllUsers(){

        return userRepository.findAll();
    }
}
