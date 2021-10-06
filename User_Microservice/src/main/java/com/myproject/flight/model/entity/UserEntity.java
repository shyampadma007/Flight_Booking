package com.myproject.flight.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.myproject.flight.model.RoleModel;

@Entity
@Table(name = "Users")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="user_id")
	//private Long userId;
	@Column(name="user_name", length =256, nullable = false,unique = true)
	private String userName;
	@Column(name="password", length =256, nullable = false,unique = true)
	private String password;
	@Column(name="email", length =256, nullable = false,unique = true)
	private String email;
	@Column(name="phone")
	private int phone;
	
	@OneToOne
	private RoleModel role;
	
	public RoleModel getRole() {
		return role;
	}
	public void setRole(RoleModel role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	/*public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}*/
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserEntity(String userName, String password, String email, int phone, RoleModel role) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.role = role;
	}
	

	
}
