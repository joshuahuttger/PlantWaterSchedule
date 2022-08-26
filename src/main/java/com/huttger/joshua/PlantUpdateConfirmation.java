package com.huttger.joshua;

import com.huttger.joshua.data.Plant;

public class PlantUpdateConfirmation {
	private String message;

	public PlantUpdateConfirmation(Plant updatedPlant) {
		message = String.format("%s located at %s was marked as watered", updatedPlant.getName(),
				updatedPlant.getLocation());
	}

	public String getConfirmationMessage() {
		return message;
	}
}
