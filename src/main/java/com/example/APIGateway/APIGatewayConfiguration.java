package com.example.APIGateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIGatewayConfiguration {
	
	@Bean
	public RouteLocator gatewayrouter(RouteLocatorBuilder builder)
	{
		return builder.routes().route(p -> p.path("/currency-exchange/**").uri("lb://currency-exchange"))
				.route(p -> p.path("/currency-exchange-new/**").filters(f->f.rewritePath("/currency-exchange-new/", "/currency-exchange/")).uri("lb://currency-exchange"))
				.build();
	}

}
