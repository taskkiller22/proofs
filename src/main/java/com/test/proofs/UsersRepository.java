package com.test.proofs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UsersRepository extends JpaRepository<Users, Void>, JpaSpecificationExecutor<Users> {

}