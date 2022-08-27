package com.huttger.joshua.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huttger.joshua.data.Plant;
import com.huttger.joshua.data.PlantRepository;

@RestController
public class AllPlantsController {
	@Autowired
	PlantRepository plantRepository;
	
	@GetMapping("/all_plants")
	public Iterable<Plant> greeting() {
		return plantRepository.findAll();
	}
}
