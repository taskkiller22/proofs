package com.test.proofs;

import com.test.proofs.model.User;
import com.test.proofs.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ProofsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProofsApplication.class, args);
    }


}
