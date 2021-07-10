package com.codingdojo.joja.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.joja.models.Dojo;
import com.codingdojo.joja.models.Ninja;
import com.codingdojo.joja.services.DojoService;
import com.codingdojo.joja.services.NinjaService;

@Controller
public class NinjaController {
	private final NinjaService niserv;

	private final DojoService doserv;
	public NinjaController(NinjaService niserv, DojoService doserv) {
		this.niserv = niserv;
		this.doserv = doserv;
	}
	
	@RequestMapping("/joja/new/ninja")
	public String newDojo(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Ninja> ninjas = niserv.getAllNin();
		List<Dojo> dojos = doserv.getAllDoj();
		model.addAttribute("dojos",dojos);
		model.addAttribute("ninjas", ninjas);
		return "/newninja.jsp";
	}
	
	
	@RequestMapping(value = "/ninja/new", method= RequestMethod.POST)
	public String index(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "/newninja.jsp";
			
		}else {
			this.niserv.createNinja(ninja);
			
			return "redirect:/";
		}
	}
}
