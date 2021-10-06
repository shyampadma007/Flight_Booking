package com.myproject.flight.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.flight.exception.UserDataNotFoundException;
import com.myproject.flight.model.ResponseModel;
import com.myproject.flight.model.UserModel;
import com.myproject.flight.model.entity.UserEntity;
import com.myproject.flight.service.User_Service;

@RestController
@CrossOrigin("*")
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	private User_Service userservice;
	
	@PostMapping("/signup")
	public ResponseEntity<String> signup(@RequestBody UserEntity user){
		System.out.println("signup user");
		userservice.saveuser(user);
		
		return ResponseEntity.ok("User registered successfully!");
	     //return "Signup Successful";
	}
	
	
	/*@RequestMapping(value = "/getUserId", method = RequestMethod.GET) 
	public ResponseModel<UserModel> user_check(@RequestParam(value = "user_name") String userName,@RequestParam(value = "password")String password){
		
		return new ResponseModel<>(userservice.getUserdetails(userName,password)); 
	}*/
	
	@RequestMapping(value = "/getUserId", method = RequestMethod.GET) 
	public ResponseEntity<String> user_check(@RequestBody UserEntity user) throws UserDataNotFoundException{
		String userDetail = userservice.getUserdetails(user);
		if(userDetail == null) {
			throw new UserDataNotFoundException("User data is not found : " + userDetail);
		}
		return new ResponseEntity<String> (userDetail,HttpStatus.OK); 
	}
	
	
	
}
