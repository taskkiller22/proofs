package com.test.proofs;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class User  {

    @Id
    private String id;

    private String username;
    private String name;
    private String lastName;
    private String address;
    private int number;

    public User(){

    }

    public User(String username, String name, String lastName, int number, String address){

        this.username=username;
        this.name=name;
        this.lastName=lastName;
        this.number=number;
        this.address=address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "User  [" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", name=" + name +
                ", lastName='" + lastName + '\'' +
                ", number=" + number +
                ", address=" + address +
                ']';
    }





}
