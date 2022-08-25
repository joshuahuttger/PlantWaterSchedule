package com.huttger.joshua;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlantsToWaterListController {

	@GetMapping("/plant_list")
	public PlantList greeting() {
		return new PlantList();
	}
}
