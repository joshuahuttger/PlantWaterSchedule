package com.huttger.joshua;

import java.util.Arrays;
import java.util.List;

import com.huttger.joshua.data.Plant;

public class PlantList {
	public List<Plant> getPlants(){
		return Arrays.asList(
				new Plant("a thing", "flower", System.currentTimeMillis()),
				new Plant("another thing", "tree", System.currentTimeMillis()));
	}
}
