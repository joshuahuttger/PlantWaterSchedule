package com.huttger.joshua.data;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PlantId implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private String location;
	
	public PlantId() {}
	public PlantId(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}
	
}