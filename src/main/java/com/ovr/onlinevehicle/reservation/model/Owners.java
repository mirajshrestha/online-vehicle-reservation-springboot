package com.ovr.onlinevehicle.reservation.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Owners {
	@Id
	private Long owners_id;
	private String fullname;
	private String email;
	private String password;
	private String contact;
	
	@OneToMany(mappedBy = "owners")
	private Set<Vehicles> vehicle = new HashSet<>();
	
	public Owners() {
		
	}

	public Owners(Long owners_id, String fullname, String email, String password, String contact,
			Set<Vehicles> vehicle) {
		super();
		this.owners_id = owners_id;
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.contact = contact;
		this.vehicle = vehicle;
	}

	public Long getOwners_id() {
		return owners_id;
	}

	public void setOwners_id(Long owners_id) {
		this.owners_id = owners_id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Set<Vehicles> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Set<Vehicles> vehicle) {
		this.vehicle = vehicle;
	}

	
	
}
