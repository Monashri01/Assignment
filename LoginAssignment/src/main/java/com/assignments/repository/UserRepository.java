package com.assignments.repository;

import org.springframework.stereotype.Repository;

import com.assignments.User;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {


}
