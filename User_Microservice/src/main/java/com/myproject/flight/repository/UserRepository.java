package com.myproject.flight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.myproject.flight.model.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

	
	//UserEntity UseUsefindByUsernameAndPassword(String username,String password);
	/*@Query("Select user_id,user_name,password from users where user_name = :userName and password = :password")
	UserEntity getUser(@Param("userName") String userName,@Param("password") String password);*/
	 
}
