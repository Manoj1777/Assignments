package com.telusko.secureapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telusko.secureapp.adminentity.Admin;

@Controller
public class AdminController {

	 @GetMapping("/home")
	public String home()
	{
		return "home";
	}
	 
	 @GetMapping("/register")
	 public String singup( Model model) {
		
		 model.addAttribute("admin", new Admin());
		 return "signUp";
	}
	 
	 
	 
}
