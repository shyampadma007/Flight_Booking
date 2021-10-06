package com.myproject.flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.flight.model.RoleModel;
import com.myproject.flight.model.UserModel;
import com.myproject.flight.model.entity.UserEntity;
import com.myproject.flight.repository.RoleRepository;
import com.myproject.flight.repository.UserRepository;

@Service
public class User_Service {
	@Autowired
    private UserRepository repo;
	
	@Autowired
	private RoleRepository rolerepo;
	
    public void saveuser(UserEntity userEnt) {
    	System.out.println("Checking user");
    	System.out.println(userEnt.toString());
    	RoleModel role = new RoleModel();
    	role.setRoleId(2);
    	role.setRole("User");
    	rolerepo.save(role);
    	userEnt.setRole(role);
        repo.save(userEnt);   
    }
	
	/*public UserModel getUserdetails(String userName,String password) { 
		UserModel usermodel = new UserModel();
		
		UserEntity userent = repo.getUser(userName,password);
		
		usermodel.setUserid(String.valueOf(userent.getUserId()));
		usermodel.setUser_name(userent.getUserName());
		usermodel.setPassword(userent.getPassword());
		
		return usermodel;
		
	}*/
    
    public String getUserdetails(UserEntity userEnt) {
    	UserModel usermodel = new UserModel();	
    	//UserEntity userent = repo.getUser(userEnt.getUserName(),userEnt.getPassword());
    	UserEntity userent = repo.findById(userEnt.getUserName()).orElse(null);
    	System.out.println(userent.getPassword() + "->" + userent.getUserName());
		if(userent.getPassword().equals(userEnt.getPassword()))
			return "Success";
		else
			return "fail";
    	
    }
	 
}
