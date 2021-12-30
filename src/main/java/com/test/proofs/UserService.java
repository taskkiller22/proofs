package com.test.proofs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public void createUser(User user){
        userRepository.save(new User(user.getName(), user.getUsername(), user.getLastName(), user.getNumber(), user.getAddress()));
    }


    public void deleteUserById (String id){
        userRepository.deleteById(id);
    }


    public void updateUserByName (String name, User updateUser){

        userRepository.save(updateUser);
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
