package com.dev.software.devsoftware.models.api.request;

public class ApiRequestBuilder {
	
	
	Match match;
	Query query;
		
	
	private Match buildMatch(){
		if(this.match == null) {
			this.match = new Match();
		} return match;			
	}
	
	
	private Query buildQuery() {
		if(this.query == null) {
			this.query = new Query();
		}
		return query;
	}
	
	
	public ApiRequest apiRequestBuilder(int size, String municipio) {
		ApiRequest apiRequest = new ApiRequest();
		Query query = this.buildQuery();
		Match match = this.buildMatch();
		match.setMunicipio(municipio);
		query.setMatch(match);
		apiRequest.setQuery(query);
		apiRequest.setSize(size);
		return apiRequest;
	}

}
