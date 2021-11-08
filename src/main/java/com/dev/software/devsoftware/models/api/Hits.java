package com.dev.software.devsoftware.models.api;

import java.util.ArrayList;

public class Hits {

	Total total;
	private float max_score;
	ArrayList<HospitalList> hits = new ArrayList<HospitalList>();
	
	public Total getTotalObject() {
		return total;
	}
	public void setTotalObject(Total totalObject) {
		this.total = totalObject;
	}
	public float getMax_score() {
		return max_score;
	}
	public void setMax_score(float max_score) {
		this.max_score = max_score;
	}
	public ArrayList<HospitalList> getHits() {
		return hits;
	}
	public void setHits(ArrayList<HospitalList> hits) {
		this.hits = hits;
	}

}