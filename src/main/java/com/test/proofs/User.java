package com.test.proofs;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Users")
public class User  {


    @Id
    private String id;
    private String username;
    private String name;
    private String lastName;
    private int number;
    private String address;
//jasjdaj
    public User(String id, String username, String name, String lastName, int number, String address){
        super();
        this.id=id;
        this.username=username;
        this.name=name;
        this.lastName=lastName;
        this.number=number;
        this.address=address;
    }

}
