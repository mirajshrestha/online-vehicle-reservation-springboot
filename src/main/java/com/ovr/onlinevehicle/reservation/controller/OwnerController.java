package com.ovr.onlinevehicle.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.ovr.onlinevehicle.reservation.model.Owners;
import com.ovr.onlinevehicle.reservation.service.OwnerService;



@RestController
@RequestMapping("/api/owner")
public class OwnerController {
	
	@Autowired
	private OwnerService ownerService;

	@GetMapping("/hello")
    public String hello() {
        return "Full Stack Java with Spring Boot & VueJS!";
    }
	
	@GetMapping("/owners")
	public List<Owners> getAllTopics() {
		return ownerService.getAllTopics();
	}
	
	@PostMapping("/register")
	public void processRegistration(@RequestBody Owners owners) {
		ownerService.registerOwner(owners);
		
	}	

}
