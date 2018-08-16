package com.rgb.rootname;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rgb.model.Place;
public class RecomendList {


	
	String name;
	
	@JsonProperty("places")
	private List<Place> places;

	public RecomendList(String name, List<Place> places) {
		super();
		this.places = places;
		this.name = name;
	}

	public List<Place> getPlaces() {
		return places;
	}

	public void setPlaces(List<Place> places) {
		this.places = places;
	}
	
}
	
	


