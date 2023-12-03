package com.example.currencyconversionservice;

import java.math.BigDecimal;



public class CurrencyConversion {
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMutiple;
	private BigDecimal quantity;
 	private BigDecimal totalcalculatedamount;
    private String environment;
    public CurrencyConversion()
    {
    	
    }
    
	public CurrencyConversion(Long id, String from, String to,  BigDecimal quantity,BigDecimal conversionMutiple , String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionMutiple = conversionMutiple;
		
		this.totalcalculatedamount = totalcalculatedamount;
		this.environment = environment;
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
	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}


	public BigDecimal getConversionMutiple() {
		return conversionMutiple;
	}

	public void setConversionMutiple(BigDecimal conversionMutiple) {
		this.conversionMutiple = conversionMutiple;
	}

	
	public BigDecimal getTotalcalculatedamount() {
		return totalcalculatedamount;
	}

	public void setTotalcalculatedamount(BigDecimal totalcalculatedamount) {
		this.totalcalculatedamount = totalcalculatedamount;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
    
    
    

}
