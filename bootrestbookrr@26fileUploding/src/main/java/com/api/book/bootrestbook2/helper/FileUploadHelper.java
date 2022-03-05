package com.api.book.bootrestbook2.helper;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.tomcat.jni.File;
import org.hibernate.mapping.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
    
    public final String UPLOAD_DIR="E:\\boot\\bootrestbookrr@26fileUploding\\src\\main\\resources\\static\\image";


public boolean uploadFile(MultipartFile multipartFile)
{
    boolean f=false;

    try{
                // InputStream is=multipartFile.getInputStream();
                //  byte data[]= new byte [is.available()];
                //  is.read(data);

                //  FileOutputStream fos= new FileOutputStream(UPLOAD_DIR+"\\"+multipartFile.getOriginalFilename());

                //     fos.write(data);
                //       fos.flush();
                //     fos.close();
                //  f=true;
              // above all code we can use this is too lengthy process
              Files.copy(multipartFile.getInputStream(), Paths.get(UPLOAD_DIR+ "\\"+multipartFile.getOriginalFilename())  , StandardCopyOption.REPLACE_EXISTING);



    }
    catch(Exception e)
    {
        e.printStackTrace();
    }



    return f;
}











}
