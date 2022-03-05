package com.xyz.springbootsimplecrude;

import com.xyz.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootsimplecrudeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootsimplecrudeApplication.class, args);

		Student student=new Student();
		student.setId(20);
		
	}
  
}
