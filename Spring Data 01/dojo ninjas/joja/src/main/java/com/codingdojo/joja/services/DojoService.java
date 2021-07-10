package com.codingdojo.joja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.joja.models.Dojo;
import com.codingdojo.joja.repositories.DojoRepo;


@Service
public class DojoService {
	private final DojoRepo dorep;
	
	
	
	public DojoService(DojoRepo dorep) {
		this.dorep = dorep;
	}
	public List<Dojo> getAllDoj(){
		return dorep.findAll();
	}
	
	public Dojo createDojo(Dojo dojo) {
		return this.dorep.save(dojo);
	}
	
	public Dojo bringDojo(Long id) {
		return this.dorep.findById(id).orElse(null);
		
	}
	
	
}
