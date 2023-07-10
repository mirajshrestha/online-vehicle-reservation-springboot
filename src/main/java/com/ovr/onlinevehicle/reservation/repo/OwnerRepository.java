package com.ovr.onlinevehicle.reservation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ovr.onlinevehicle.reservation.model.Owners;

public interface OwnerRepository extends JpaRepository<Owners, Long>{
	
}
