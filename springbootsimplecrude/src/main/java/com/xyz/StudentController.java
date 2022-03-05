package com.xyz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
   private  StudentRepo studentRepo;

   @PostMapping("save")
   public void create(@RequestBody Student student)
   {
      studentRepo.save(student);
   }




}
