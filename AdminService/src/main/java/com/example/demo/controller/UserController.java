package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@CrossOrigin("*")
@RestController
public class UserController {

	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/onSaveUser")
	public ResponseEntity<User>onSaveUser(@RequestBody User user1)
	{
		User user=userService.saveUser(user1);
		return new ResponseEntity<User>(user,HttpStatus.CREATED);
	}
	
	
	
	
	
	
	
	
	@GetMapping("/ongetuser/{userName}/{password}")
	public ResponseEntity<User> onGetUser(@PathVariable("userName")String userName,@PathVariable("password")
	String password)
	{
		User user=userService.findByUserNameAndPassword(userName,password);
		return new  ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@GetMapping("/onget_All_user")
	public ResponseEntity<List<User>> onGetAllUser()
	{
		List<User> allUser1=userService.findAllEmployee();
		return new  ResponseEntity<List<User>>(allUser1,HttpStatus.OK);
	}
	
	
	
	
	
	
}
