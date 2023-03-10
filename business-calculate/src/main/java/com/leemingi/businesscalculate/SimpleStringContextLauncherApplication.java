package com.leemingi.businesscalculate;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class SimpleStringContextLauncherApplication {	
	public static void main(String[] args) {
		// launch a context
		try(var context = new AnnotationConfigApplicationContext(SimpleStringContextLauncherApplication.class)){
			
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}

}

