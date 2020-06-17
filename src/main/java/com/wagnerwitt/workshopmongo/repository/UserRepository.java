package com.wagnerwitt.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wagnerwitt.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	
	
}
