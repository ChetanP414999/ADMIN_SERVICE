package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private  UserRepository  userRepository;
	
	
	@Override
	public User saveUser(User user1) {
		User user = userRepository.save( user1);
		return user;
	}
	
	@Override
	public User findByUserNameAndPassword(String userName, String password) {
		
		User user = userRepository.findByUserNameAndPassword(userName, password);
		return user;
	}

	@Override
	public List<User> findAllEmployee() {
		List<User> user=userRepository.findAll();
		return user;
	}



	

}
