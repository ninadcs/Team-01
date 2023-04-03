package com.codewiththarjun.fullstack.backend.repository;

import com.codewiththarjun.fullstack.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}

