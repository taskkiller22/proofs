package com.test.proofs;

import java.util.List;

public interface UserService {

        List<User> findAll();
    User findByUsername(String username);

    User findByName(String Name);

    List<User> findAllByName();

        User saveOrUpdateUser(User user);

        void deleteUserById(String id);


}
