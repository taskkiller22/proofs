package com.test.proofs;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String>{




    @Query(value = "{username:'?0'", fields="{'name': 1,'lastname': 1, 'number' : 1, 'address': 1}")
    List<User> findByUsername(String username);


    @Query(value = "{name:'?0'", fields="{'username': 1,'lastname': 1, 'number' : 1, 'address': 1}")
    List<User> findByName(String name);

    @Query(value = "{name:'?0'", fields="{'username': 1,'lastname': 1, 'number' : 1, 'address': 1}")
    List<User> findall(String username);


    public long count();

}