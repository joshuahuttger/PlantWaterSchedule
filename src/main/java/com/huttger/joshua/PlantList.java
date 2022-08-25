package com.huttger.joshua;

import java.util.Arrays;
import java.util.List;

public class PlantList {
	public List<Plant> getPlants(){
		return Arrays.asList(
				new Plant(0, "flower"),
				new Plant(2, "tree"));
	}
}
