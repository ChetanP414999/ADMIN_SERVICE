package com.example.demo.model;

import com.example.demo.enums.UserType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String userName;
	private String password;
	
	@Enumerated(EnumType.STRING)
	private UserType userType;
	
	
}
