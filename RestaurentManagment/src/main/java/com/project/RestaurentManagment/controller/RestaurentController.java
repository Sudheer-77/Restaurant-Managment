package com.project.RestaurentManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.RestaurentManagment.model.Restaurent;
import com.project.RestaurentManagment.repo.RestaurentRepo;

@RestController
@RequestMapping("restaurent")
public class RestaurentController {
	@Autowired
RestaurentRepo restaurentRepo;
	@PostMapping(" /create")
	Restaurent createRestaurent(@RequestBody Restaurent restaurent) {
		 return restaurentRepo.save(restaurent);
		 
	}
	@GetMapping("/gelAllres")
	 List<Restaurent>getALLRestaurent(){
		 return restaurentRepo.findAll();
	 }
}
