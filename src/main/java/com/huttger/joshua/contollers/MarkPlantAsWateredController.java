package com.huttger.joshua.contollers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huttger.joshua.PlantUpdateConfirmation;
import com.huttger.joshua.data.Plant;
import com.huttger.joshua.data.PlantId;
import com.huttger.joshua.data.PlantRepository;

@RestController
public class MarkPlantAsWateredController {
	
	@Autowired
	private PlantRepository plantRepository; 
	
	@GetMapping("/mark_plant_as_watered")
	public PlantUpdateConfirmation markPlantAsWatered(@RequestParam(value = "name", defaultValue = "-1") String name, 
			@RequestParam(value = "location", defaultValue = "") String location) throws Exception {
			Plant wateredPlant = new Plant(name, location, System.currentTimeMillis());
			markPlantAsWateredInDB(wateredPlant);
			return new PlantUpdateConfirmation(wateredPlant);
	}

	private void markPlantAsWateredInDB(Plant plant) throws Exception {
		System.out.printf("chicken tenders\n\n\n%s\n\n\n\n",plantRepository.findById(new PlantId(plant.getName(), plant.getLocation())).get());
		if(plantRepository.findById(new PlantId(plant.getName(), plant.getLocation())).isEmpty()) {
			throw new Exception(String.format("%s does not exist in the db.", plant));
		}
		plantRepository.save(plant);
	}
}