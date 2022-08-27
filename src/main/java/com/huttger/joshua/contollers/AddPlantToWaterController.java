package com.huttger.joshua.contollers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huttger.joshua.data.Plant;
import com.huttger.joshua.data.PlantId;
import com.huttger.joshua.data.PlantRepository;

@RestController
public class AddPlantToWaterController {
	@Autowired
	PlantRepository plantRepository;
	
	@GetMapping("/add_plant")
	public Plant addPlantToBeWatered(@RequestParam(value = "name", defaultValue = "") String name,
			@RequestParam(value = "location", defaultValue = "") String location) throws Exception {
			Plant newPlant = new Plant(name, location, -1);
			if(plantRepository.findById(new PlantId(name, location)).isEmpty()){
				plantRepository.save(newPlant);
			}else {
				throw new Exception(String.format("{} already exists in the db", newPlant));
			}
			return newPlant;
	}
}
