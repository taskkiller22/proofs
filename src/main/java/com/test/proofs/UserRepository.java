package com.test.proofs;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public  interface UserRepository extends MongoRepository<User, String>{
 List<User> findByUsername(String username);
 List<User> findByName(String name);

}