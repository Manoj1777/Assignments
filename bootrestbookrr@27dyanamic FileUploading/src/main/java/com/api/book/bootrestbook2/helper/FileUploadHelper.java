package com.api.book.bootrestbook2.helper;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
    
   // public final String UPLOAD_DIR="E:\\boot\\bootrestbookrr@26fileUploding\\src\\main\\resources\\static\\image";
    public final String UPLOAD_DIR="E:\\boot\\bootrestbookrr@26fileUploding\\src\\main\\resources\\static\\image";


public boolean uploadFile(MultipartFile multipartFile)
{
    boolean f=false;

    try{

              Files.copy(multipartFile.getInputStream(), Paths.get(UPLOAD_DIR+ "\\"+multipartFile.getOriginalFilename())  , StandardCopyOption.REPLACE_EXISTING);



    }
    catch(Exception e)
    {
        e.printStackTrace();
    }



    return f;
}











}
