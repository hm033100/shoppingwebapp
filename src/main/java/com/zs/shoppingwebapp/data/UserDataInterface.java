package com.zs.shoppingwebapp.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.zs.shoppingwebapp.model.User;

@Repository
public interface UserDataInterface extends MongoRepository<User, String> {
	
	@Query("{'username': ?0, 'password': ?1}")
	public User findByUsernameAndPassword(String username, String password);
}