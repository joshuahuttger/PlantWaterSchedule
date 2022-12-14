package com.huttger.joshua.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huttger.joshua.data.Plant;
import com.huttger.joshua.data.PlantRepository;

@RestController
public class PlantsToWaterListController {
	@Autowired
	PlantRepository plantRepository;
	
	@GetMapping("/plants_to_be_watered")
	public Iterable<Plant> greeting() {
		return plantRepository.findByLastUpdatedLessThan(System.currentTimeMillis() - (60 * 1000));
	}
}
