package com.one.one2one.restController;

import java.util.List;

import com.one.one2one.entities.*;
import com.one.one2one.repositories.AddressRepositoy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressDetailsRestController {
      
    @Autowired
    private AddressRepositoy addressRepositoy;


    @GetMapping("/all") // http://localhost:8080/user/all
    public List< Address >  getAllUserDetails()
    {
        return addressRepositoy.findAll();
    }
    
    @PostMapping("/save")
    public  Address   saveUser( @RequestBody Address address)
    {
        return addressRepositoy.save(address);
    }

    @PutMapping("/update")
    public  Address   updateUser( @RequestBody Address address)
    {
        return addressRepositoy.save(address);
    }

    @DeleteMapping("/update")
    public  String   deleteUser( @RequestBody Address address)
    {
        addressRepositoy.delete(address);
         return "deleted successfully"+address;
    }
}
