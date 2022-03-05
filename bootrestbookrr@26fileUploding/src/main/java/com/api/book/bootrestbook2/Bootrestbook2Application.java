package com.api.book.bootrestbook2;
// bidiectonal one to one mapping
// previous book has author but this project we are having author has book at that we take both one to one
// in this project we have used 2 annotation  @JsonManagedReference and jsonbackreference 
// if we don't use above reference then it will go in loop


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bootrestbook2Application {


	public static void main(String[] args)
	 {
		SpringApplication.run(Bootrestbook2Application.class, args);
		
	}

}