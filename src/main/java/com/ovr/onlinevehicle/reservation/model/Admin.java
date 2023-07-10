package com.ovr.onlinevehicle.reservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
	
	@Id
	private Long admin_id;
	private String username;
	private String password;
	
	public Admin() {
		
	}

	public Admin(Long admin_id, String username, String password) {
		super();
		this.admin_id = admin_id;
		this.username = username;
		this.password = password;
	}

	public Long getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(Long admin_id) {
		this.admin_id = admin_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
