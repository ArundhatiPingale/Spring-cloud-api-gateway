package com.example.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	
	@Autowired
	private CurrencyExchangeRepository repository;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retriveExchangeValue(@PathVariable String from ,
			@PathVariable String to)
	{
		/*
		 * CurrencyExchange currencyexchange= new CurrencyExchange(1000L , from, to ,
		 * BigDecimal.valueOf(50));
		 */
		
		CurrencyExchange currencyexchange=repository.findByFromAndTo(from, to);
		
		if (currencyexchange==null)
			
		{
			throw new RuntimeException ("unable to get data "+from+"to"+to);
		}
		String port =environment.getProperty("local.server.port");
		currencyexchange.setEnvironment(port);
		return currencyexchange;
		
	}
	

}
