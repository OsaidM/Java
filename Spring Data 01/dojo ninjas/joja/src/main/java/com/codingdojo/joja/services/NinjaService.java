package com.codingdojo.joja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.joja.models.Ninja;
import com.codingdojo.joja.repositories.NinjaRepo;



@Service
public class NinjaService {
	private final NinjaRepo ninrep;

	public NinjaService(NinjaRepo ninrep) {
		this.ninrep = ninrep;
	}
	
	public List<Ninja> getAllNin(){
		return ninrep.findAll();
		
	}
	
	public Ninja createNinja(Ninja ninja) {
		return this.ninrep.save(ninja);
	}
}
