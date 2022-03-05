package com.jpa.test.bootjpaexample;

import java.util.List;


import com.jpa.test.bootjpaexample.dao.UserRepository;
import com.jpa.test.bootjpaexample.entities.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ApplicationContext	  context= SpringApplication.run(BootjpaexampleApplication.class, args);
	    UserRepository userRepository=context.getBean(UserRepository.class);
		var user=new User();
		user.setName("manoj");
		user.setId(17);
		user.setCity("latur");
		user.setStatus("working");

    User user1 =userRepository.save(user);

	User user2=new User();
	user2.setCity("mumbai");
	user2.setId(18);
	user2.setName("suraj");
	user2.setStatus("working");
	     List<User> users=List.of(user1,user2);
		Iterable<User> result= userRepository.saveAll(users);

		result.forEach(User->{System.out.println(user);});
	
		// update
		userRepository.findAllById(17);

}

}
