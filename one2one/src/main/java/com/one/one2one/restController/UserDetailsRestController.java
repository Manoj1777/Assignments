package com.one.one2one.restController;

import java.util.List;

import com.one.one2one.entities.*;
import com.one.one2one.repositories.UserDetailsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")  
public class UserDetailsRestController {
    
    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @GetMapping("/all") // http://localhost:8080/user/all
    public List< UserDetails >  getAllUserDetails()
    {
        return userDetailsRepository.findAll();
    }

    @PostMapping("/save")
    public  UserDetails   saveUser( @RequestBody UserDetails details)
    {
        return userDetailsRepository.save(details);
    }

    @PutMapping("/update")
    public  UserDetails   updateUser( @RequestBody UserDetails details)
    {
        return userDetailsRepository.save(details);
    }

    @DeleteMapping("/delete")
    public  String   deleteUser( @RequestBody UserDetails details)
    {
         userDetailsRepository.delete(details);
         return "deleted successfully"+details;
    }
}
