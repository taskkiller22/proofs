package com.test.proofs.resource;



import com.test.proofs.service.UserService;
import com.test.proofs.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserService userservice;


    @GetMapping("/usersAll")
    public @ResponseBody List<User> listAllUsers(){
        System.out.println(userservice.getAllUsers());
      return userservice.getAllUsers();
    }

    @RequestMapping(value = "/usersid/{contentId:.*}", method = RequestMethod.POST)
    public Optional<User> findById(@PathVariable("id")String id){
        return userservice.getUsersById(id);
    }


    @PutMapping("/insert/")
    public User insert(@RequestParam String id, String username, String name, String lastName, String number, String address ){
       User user = new User(id, username, name, lastName, number, address);

        return  userservice.insert(user);
    }

    @DeleteMapping("/deleteUser/")
    public ResponseEntity deleteUser(@RequestParam String id){
        userservice.deleteById(id);
    return new ResponseEntity(HttpStatus.OK);
    }



}
