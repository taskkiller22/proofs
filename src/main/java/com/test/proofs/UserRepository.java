package com.test.proofs;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public  interface UserRepository extends MongoRepository<User, String>{

 User findByUsername(String username);

 User findByName(String Name);

 User saveOrUpdateUserById(String id);

 User deleteUserById(String id);


 List<User> findAllByOrderByName();

}