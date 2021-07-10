package com.codingdojo.joja.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.joja.models.Dojo;
import com.codingdojo.joja.models.Ninja;
import com.codingdojo.joja.services.DojoService;
import com.codingdojo.joja.services.NinjaService;


@Controller
public class DojoController {
	private final DojoService doserv;
	private final NinjaService niserv;
	public DojoController(DojoService doserv, NinjaService niserv) {
		this.doserv = doserv;
		this.niserv = niserv;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Dojo> dojos = doserv.getAllDoj();
		List<Ninja> ninjas = niserv.getAllNin();
		model.addAttribute("ninjas",ninjas);
		model.addAttribute("dojos",dojos);
		return "index.jsp";
	}
	
	@RequestMapping("/joja/new/dojo")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo,Model model) {
		List<Dojo> dojos = doserv.getAllDoj();
		model.addAttribute("dojos",dojos);
		return "newdojos.jsp";
	}
	
	@RequestMapping(value = "/dojo/new", method= RequestMethod.POST)
	public String index(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "/newdojos.jsp";
			
		}else {
			this.doserv.createDojo(dojo);
			
			return "redirect:/";
		}
	}
	
	@RequestMapping("/dojo/{id}")
	public String showDojo(@PathVariable("id") Long id,Model model) {
		
		model.addAttribute("dojo", this.doserv.bringDojo(id));
		return "dojodetails.jsp";
	}
	
	
}
