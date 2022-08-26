package com.huttger.joshua.data;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Plant {

	@EmbeddedId
	private PlantId id;
	private long lastUpdated;
	
	public Plant() {}
	
	public Plant(String name, String location, long lastUpdated) {
		this.lastUpdated = lastUpdated;
		this.id	= new PlantId(name, location);
	}
	
	public long getLastUpdated() {
		return lastUpdated;
	}

	public String getLocation() {
		return id.getLocation();
	}

	public String getName() {
		return id.getName();
	}
}


