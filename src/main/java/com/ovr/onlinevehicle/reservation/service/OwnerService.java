package com.ovr.onlinevehicle.reservation.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ovr.onlinevehicle.reservation.model.Owners;
import com.ovr.onlinevehicle.reservation.repo.OwnerRepository;



@Service
public class OwnerService {
	
	@Autowired
	private OwnerRepository ownerRepository;
	
	private List<Owners> owners = new ArrayList<>(Arrays.asList(
			new Owners(1L, "Miraj Shrestha", "mirajshrestha10@gmail.com", "123456", "9845076998", null)
			));
	
	public void registerOwner(Owners owners) {
		ownerRepository.save(owners);
	}

	public List<Owners> getAllTopics() {
		List<Owners> owners = new ArrayList<>();
		ownerRepository.findAll().forEach(owners::add);
		return owners;
	}
}
