package com.leemingi.springframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name () {
		return "Mingi";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Anna", 22, new Address("1115", "Grinnell"));
		
		return person;
	}
	
	@Bean
	public Person person2() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3(String name, int age, Address address) {
		return new Person(name, age, address);
	}
	
	@Bean
	public Address address() {
		var address = new Address("1132 Main", "Grinnell");
		
		return address;
	}
	
}
