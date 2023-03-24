package com.springboot.sportyshoes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.sportyshoes.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	
}
