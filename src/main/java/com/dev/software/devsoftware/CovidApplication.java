package com.dev.software.devsoftware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.ExchangeFilterFunctions;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class CovidApplication {

	@Bean
		public WebClient webClient(WebClient.Builder builder) {
			return builder.baseUrl("https://elastic-leitos.saude.gov.br/leito_ocupacao/_search")
					.filter(ExchangeFilterFunctions
			                .basicAuthentication("user-api-leitos", "aQbLL3ZStaTr38tj"))		
			.build();			
		}

	public static void main(String[] args) {
		SpringApplication.run(CovidApplication.class, args);
	}

}
