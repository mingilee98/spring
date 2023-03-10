package com.leemingi.businesscalculate;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class BusinessCalculationService {
	
	private DataService dataService;
	
	@Autowired
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;

	}
	
	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
	

}
