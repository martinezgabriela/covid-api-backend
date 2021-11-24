package com.dev.software.devsoftware.service;

import com.dev.software.devsoftware.models.api.ApiResponse;
import com.dev.software.devsoftware.models.api.HospitalList;
import com.dev.software.devsoftware.models.api.request.ApiRequest;
import com.dev.software.devsoftware.models.api.request.Match;
import com.dev.software.devsoftware.models.api.request.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;

@Service
public class HospitalsService {

	@Autowired
	private WebClient webClient;

	public ArrayList<HospitalList> getDataApi() {

		ApiRequest request = new ApiRequest();
		Match match = new Match();
		match.setMunicipio("Porto Alegre");
		Query query = new Query();
		query.setMatch(match);
		request.setQuery(query);
		request.setSize(5000);

		Mono<ApiResponse> monoResponse = this.webClient.method(HttpMethod.GET).contentType(MediaType.APPLICATION_JSON).bodyValue(request).retrieve().bodyToMono(ApiResponse.class);
		ApiResponse response = monoResponse.block();

		ArrayList<HospitalList> hospitalsResponse = new ArrayList<HospitalList>();
		hospitalsResponse = response.getHits().getHits();

		return hospitalsResponse;
	}
}
