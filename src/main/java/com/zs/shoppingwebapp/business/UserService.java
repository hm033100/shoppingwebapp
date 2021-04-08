package com.zs.shoppingwebapp.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zs.shoppingwebapp.data.UserDataInterface;
import com.zs.shoppingwebapp.model.User;


@Service
public class UserService {
	
		@Autowired
		private UserDataInterface userRepo;
		
		public UserService(UserDataInterface userRepo) {
			this.userRepo = userRepo;
		}
		
		public List<User> findAll() {
			return userRepo.findAll();
		}
		
		public Optional<User> findById(String id) {
			return userRepo.findById(id);
		}
		
		public User save(User user) {
			return userRepo.save(user);
		}
		
		public void deleteById(String Id){
			userRepo.deleteById(Id);
		}
		
		public User validate(User user) {
			return userRepo.findByUsernameAndPassword(user.getUsername(), 
													  user.getPassword());
		}

}
