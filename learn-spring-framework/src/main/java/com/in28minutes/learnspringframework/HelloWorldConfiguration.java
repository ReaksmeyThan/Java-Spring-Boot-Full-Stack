package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Persion2
record Person(String name ,int age,Address address) {};
//--Address -fristLine , City
record Address(String firstLine,String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String  name() {
		return "Reaksmey";
	}
	
	@Bean
	public int  age() {
		return 32;
	}
	
	@Bean
	public Person  person() {
		return new Person("Mey Mey",23,new Address("PP", "Cambo"));
	}
	
	@Bean
	public Person  person2MethodCall() {
		return new Person(name(),age(),address());
	}
	
	@Bean
	public Person  person3Parameters(String name,int age,Address address3) {
		return new Person(name,age,address3);
	}
	
	
	
	@Bean(name="address2")
	public Address  address() {
		return new Address("Cambodia ","PhnomPenh");
	}
	
	@Bean(name="address3")
	public Address  address3() {
		return new Address("BangKok ","Thailand");
	}
}
