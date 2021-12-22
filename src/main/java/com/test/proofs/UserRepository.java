package com.test.proofs;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import javax.lang.model.element.Name;
import java.util.List;

public interface UserRepository extends MongoRepository<User, String>{

 User findByUsername(String username);

 User findByName(String Name);

 User SaveOrUpdate(User user);

 User deleteUserByName(User user);


 List<User> findAllByName();

}