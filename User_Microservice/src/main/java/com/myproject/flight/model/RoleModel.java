package com.myproject.flight.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Role")
public class RoleModel {

	@Id
	private int roleId;
	private String role;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public RoleModel(int roleId, String role) {
		super();
		this.roleId = roleId;
		this.role = role;
	}
	public RoleModel() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
}
