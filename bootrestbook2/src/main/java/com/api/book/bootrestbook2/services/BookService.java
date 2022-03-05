package com.api.book.bootrestbook2.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.api.book.bootrestbook2.entities.Book;

import org.springframework.stereotype.Component;


@Component
public class BookService {
    private static List<Book> list= new ArrayList<>();

    static {
       list.add(new Book(12, "the tushsr", "manoj"));
       list.add(new Book(13, "the mountain", "hanmant"));
       list.add(new Book(14, "the sushsnt", "sarthak"));
    }

    // get all books

    public List<Book> getAllBooks()
    {
        return list;
    }
     // get single book
    public Book getBookById(int id)
    {
        Book book=null;
           book=list.stream().filter(e->e.getId()==id).findFirst().get();
           return book;
    }
   // adding the book
   public Book addBook( Book b)
    {
       list.add(b);
       return b;
   }
   // deleting book
public void deleteBook(int bId)
 {
  list= list.stream().filter(book -> book.getId() !=bId
    ).collect(Collectors.toList());
}


// update book

public void updateBook(Book book, int bookId)
 {
     list= list.stream().map(b ->{
        if(b.getId()==bookId)
        {
            b.setAuthor(book.getAuthor());
            b.setTitle(book.getTitle());
        }


        return b;
     }).collect(Collectors.toList());
}
  
}


