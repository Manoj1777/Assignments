package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SingInController {

	@GetMapping("/singin")
public String singin() 
	{
	  return "login";
   }
	

}
