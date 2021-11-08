package com.dev.software.devsoftware.models.api.request;

public class ApiRequest {

	private int size;
	Query QueryObject;

	// Getter Methods

	public float getSize() {
		return size;
	}

	public Query getQuery() {
		return QueryObject;
	}

	// Setter Methods

	public void setSize(int size) {
		this.size = size;
	}

	public void setQuery(Query queryObject) {
		this.QueryObject = queryObject;
	}

}
