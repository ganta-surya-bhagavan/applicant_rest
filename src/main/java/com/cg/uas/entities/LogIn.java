package com.cg.uas.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class LogIn {
	@Id
	@Column(name="login_id")
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="role")
	private String role;
	public LogIn(){
		
	}
	public LogIn(String userName, String password, String role) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
