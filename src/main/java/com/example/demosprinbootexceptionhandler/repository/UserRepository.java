package com.example.demosprinbootexceptionhandler.repository;

import com.example.demosprinbootexceptionhandler.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
