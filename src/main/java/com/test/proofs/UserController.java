package com.test.proofs;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userservice;

    @GetMapping("/usersAll")
    public @ResponseBody List<User> GetAllUsers(){

      return userservice.getAllUsers();

    }

    @GetMapping("/usersID/{id}")
    public @ResponseBody List<User> GetAllUsersById(User id){

        return userservice.getAllUsersById(id);

    }

    @DeleteMapping ("/usersDeleteID/{id}")
    public @ResponseBody void deleteUserById (User id){

    }

    @PutMapping("/usersDeleteID/{name}")
    public @ResponseBody void updateUserByName(User name){

    }

    @GetMapping("/usersUsername/{username}")
    public @ResponseBody List<User> GetAllUsersByUsername(String username){

        return userservice.getAllUsersByUsername(username);

    }

    @GetMapping("/UsersName/{name}")
    public @ResponseBody List<User> GetAllUsersByName(String name){

        return userservice.getAllUsersByName(name);

    }

    @PostMapping("/UsersCreate")
    public @ResponseBody void createUser(User user){

    }
}
