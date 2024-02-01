package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
	
	@Bean
	@Primary
	// No qualifying bean of type 'com.in28minutes.leanspringframework.Adress'
	//available: expected single matching bean but found 2: address2, address3
	public Person  person4Parameters(String name,int age,Address address) {
		// name , age , address2
		return new Person(name,age,address);
	}
	
	@Bean
	
	public Person person5Qualifier(String name,int age,@Qualifier("address3Qualifier")Address address) {
		// name , age , address2
		return new Person(name,age,address);
	}
	
	@Bean(name="address2")	
	@Primary 
	public Address  address() {
		return new Address("Cambodia ","PhnomPenh");
	}
	
	@Bean(name="address3")
	@Qualifier("address3Qualifier")
	public Address  address3() {
		return new Address("BangKok ","Thailand");
	}
}
