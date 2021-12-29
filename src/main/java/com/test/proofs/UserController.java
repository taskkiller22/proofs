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
    UserRepository userRepository;
/*
    @GetMapping("/users")
    public ResponseEntity<List<User>> GetAllUsers(@RequestParam(required = false) String name){

        return null;
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") String id){

        return null;
    }
    @PostMapping("/users")
    public ResponseEntity<User> createUSer(@RequestBody User user){

        return null;
    }
    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUsers(@PathVariable("id") String id, @RequestBody User user){

        return null;
    }
    @DeleteMapping("/users/{id}")
    public ResponseEntity<HttpStatus> deleteUsers(@PathVariable("id") String id) {

        return null;
    }

    @DeleteMapping("/users")
    public ResponseEntity<HttpStatus> deleteAllUser() {

        return null;
    }

    @GetMapping("/users/published")
    public ResponseEntity<List<User>> findByName() {

        return null;
    }
    */
    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        try {
            User _user = userRepository.save(new User(user.getName(), user.getUsername(), user.getLastName(), user.getNumber(), user.getAddress()));
            return new ResponseEntity<>(_user, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    /*
    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllUsersByUsername(@RequestParam String username) {
        try {
            List<User> users = new ArrayList<User>();

            if (username == null)
                userRepository.findAll().forEach(users::add);
            else
                userRepository.findByUsername(username).forEach(users::add);

            if (users.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    */
    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllUsersByName(@RequestParam String name) {
        try {
            List<User> users = new ArrayList<User>();

            if (name == null)
                userRepository.findAll().forEach(users::add);
            else
                userRepository.findByName(name).forEach(users::add);

            if (users.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUsersById(@PathVariable("id") String id) {
        Optional<User> userData = userRepository.findById(id);

        if (userData.isPresent()) {
            return new ResponseEntity<>(userData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") String id, @RequestBody User user) {
        Optional<User> userData = userRepository.findById(id);

        if (userData.isPresent()) {
            User _user = userData.get();
            _user.setName(user.getName());
            _user.setLastName(user.getLastName());
            _user.setNumber(user.getNumber());
            _user.setAddress(user.getAddress());
            return new ResponseEntity<>(userRepository.save(_user), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/user/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") String id) {
        try {
            userRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/user")
    public ResponseEntity<HttpStatus> deleteAllUsers() {
        try {
            userRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
