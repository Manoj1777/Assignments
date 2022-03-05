package com.api.book.bootrestbook2.controllers;

import com.api.book.bootrestbook2.helper.FileUploadHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {
    
     @Autowired
   private FileUploadHelper fileUploadHelper;


    @PostMapping("/upload-file")
    public ResponseEntity<String> fileUploading( @RequestParam("file") MultipartFile file)
     {
        // System.out.println(file.getOriginalFilename());
        // System.out.println(file.getSize());
       //  System.out.println(file.getContentType());
        // System.out.println(file.getName());
     

         try {
            if(file.isEmpty())
            {
               
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("please uploading.. nothing is there");
            }
    
            //
            if(!file.getContentType().equals("image/jpeg"))
            {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("onlt jpeg content file are allowed");
    
            }

           Boolean f= fileUploadHelper.uploadFile(file);
           if(f)
           {
               return ResponseEntity.ok("filr is successfully uploaded");
           }

         } catch (Exception e) {
            e.printStackTrace();
         }
       





        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("something went wrong try gain");

        
    }
}
