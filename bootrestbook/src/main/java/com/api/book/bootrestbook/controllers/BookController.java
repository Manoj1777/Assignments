package com.api.book.bootrestbook.controllers;




import com.api.book.bootrestbook.entities.Book;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    
  @GetMapping("/books")
  public Book getBook()
     {
      
      Book book=new Book();
      book.setId(17);
      book.setTitle("the ring");
      book.setAuthor("manoj bhete");

        return book;
    }
}
