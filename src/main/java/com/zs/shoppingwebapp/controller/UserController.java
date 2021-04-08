package com.zs.shoppingwebapp.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zs.shoppingwebapp.business.UserService;
import com.zs.shoppingwebapp.model.User;

@CrossOrigin
@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> getAll() {
		return userService.findAll();
	}
	
	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public User validate(@RequestBody User user) {
		return userService.validate(user);
	}
	
	@RequestMapping(value = "/id", method=RequestMethod.POST)
	public Optional<User> viewById(@RequestBody Map<String, String> json) {
		String _id = json.get("_id");
		return userService.findById(_id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public User save(@RequestBody User user) {
		return userService.save(user);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public void deleteById(@RequestBody String Id){
		userService.deleteById(Id);
	}

}
