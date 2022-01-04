package com.test.proofs;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public  interface UserRepository extends MongoRepository<User, String>{
 List<User> findAll();
 List<User> findByUsername(String username);
 List<User> findById(User id);
 List<User> findByName(String name);

}