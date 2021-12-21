package com.test.proofs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ProofsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProofsApplication.class, args);
    }

}
