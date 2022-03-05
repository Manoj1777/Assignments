package com.learn.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.models.User;

@Service
public class UserService {

	List<User> list= new ArrayList<>();

	public UserService()
	{

		list.add(new User("abc", "abc", "abc@gmail.com"));
		list.add(new User("xyz", "xyz", "xyz@gmail.com"));
	 }
	
	// get all user
	
	public List<User> getAllUsers()
	{
	   return this.list;	
	}
	
	// get single user
	
	public User getAUser(String userName)
	{
        return this.list.stream().filter((user)-> user.getUserName().equals(userName)).findAny().orElse(null);
	}
	
	// add user
	public User addUser( User user)
	{
		
		this.list.add(user);
		return user;
	}
	
	
	

}
