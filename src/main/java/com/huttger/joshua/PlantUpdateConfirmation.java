package com.huttger.joshua;

public class PlantUpdateConfirmation {
	private String message;

	public PlantUpdateConfirmation(Plant updatedPlant) {
		message = String.format("Plant with id:%s and name:%s was marked as watered", updatedPlant.getId(),
				updatedPlant.getContent());
	}

	public String getConfirmationMessage() {
		return message;
	}
}
