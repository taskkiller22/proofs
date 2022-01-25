package com.test.proofs.repository;

import com.test.proofs.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;


import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public  interface UserRepository extends MongoRepository<User, String>{

    @Override
    Optional<User> findById(String id);


}