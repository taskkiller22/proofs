package com.test.proofs;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userservice;

    @GetMapping("/users")
    public @ResponseBody List<User> GetAllUsers(){

      return userservice.getAllUsers();

    }

    @GetMapping("/users/{id}")
    public @ResponseBody List<User> GetAllUsersById(User id){

        return userservice.getAllUsersById(id);

    }

    @GetMapping("/users/{username}")
    public @ResponseBody List<User> GetAllUsersByUsername(String username){

        return userservice.getAllUsersByUsername(username);

    }

    @GetMapping("/Users/{name}")
    public @ResponseBody List<User> GetAllUsersByName(String name){

        return userservice.getAllUsersByName(name);

    }
}
