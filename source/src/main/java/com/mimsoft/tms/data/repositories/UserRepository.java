package com.mimsoft.tms.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mimsoft.tms.data.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
