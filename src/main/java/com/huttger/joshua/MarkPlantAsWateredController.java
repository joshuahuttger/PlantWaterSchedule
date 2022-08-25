package com.huttger.joshua;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarkPlantAsWateredController {

	//TODO This really should be a post
	@GetMapping("/mark_plant_as_watered")
	public PlantUpdateConfirmation markPlantAsWatered(@RequestParam(value = "id", defaultValue = "-1") int id, 
			@RequestParam(value = "name", defaultValue = "") String name) {
			Plant updatedPlant = markPlantAsWateredInDB(id, name);
			return new PlantUpdateConfirmation(updatedPlant);
	}

	private Plant markPlantAsWateredInDB(int id, String name) {
		return new Plant(id, name);
	}
}