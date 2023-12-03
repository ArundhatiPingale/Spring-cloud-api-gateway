package com.example.currencyexchangeservice;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CurrencyExchange {
	
	@Id
	private Long id;
	@Column(name="currency_from")
	private String from;
	
	@Column(name ="currency_to")
	private String to;
	private BigDecimal conversionMutiple;
	private  String Environment;
	
	public CurrencyExchange()
	{
		
	}
	public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMutiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		conversionMutiple = conversionMutiple;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMutiple() {
		return conversionMutiple;
	}
	public void setConversionMutiple(BigDecimal conversionMutiple) {
		conversionMutiple = conversionMutiple;
	}
	public String getEnvironment() {
		return Environment;
	}
	public void setEnvironment(String environment) {
		Environment = environment;
	}
	
	
	
	
	

}
