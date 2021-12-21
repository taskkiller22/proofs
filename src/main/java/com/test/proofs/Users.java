package com.test.proofs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "_id")
    @Id
    private String id;

    @Column(name = "address")
    private String address;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "name")
    private String name;

    @Column(name = "number")
    private String number;

    @Column(name = "username")
    private String username;

}
