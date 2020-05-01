package com.tts.rsvr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tts.rsvr.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
