package com.ovr.onlinevehicle.reservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Vehicles {
	@Id
	private Long vehicle_id;
	
	@ManyToOne
	@JoinColumn(name = "owners_id")
	private Owners owners;

	public Vehicles() {
		
	}

	public Vehicles(Long vehicle_id, Owners owners) {
		super();
		this.vehicle_id = vehicle_id;
		this.owners = owners;
	}

	public Long getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(Long vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public Owners getOwners() {
		return owners;
	}

	public void setOwners(Owners owners) {
		this.owners = owners;
	}
	
	
}
