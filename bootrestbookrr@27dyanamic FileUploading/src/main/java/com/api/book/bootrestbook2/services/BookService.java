package com.api.book.bootrestbook2.services;

import java.util.List;

import com.api.book.bootrestbook2.dao.BookRepository;
import com.api.book.bootrestbook2.entities.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BookService {
 
    @Autowired
private BookRepository bookRepository;
    // get all books

    public List<Book> getAllBooks()
    {
        List<Book>  list = (List<Book>) this.bookRepository.findAll();
         return list;
    }
     // get single book
    public Book getBookById(int id)
    {
        Book book=null;
        book =this.bookRepository.findById(id);
           return book;
    }
   // adding the book
   public Book addBook( Book b)
    {
         Book result= bookRepository.save(b);

       return result;
   }
   // deleting book
public void deleteBook(int bId)
 {
      bookRepository.deleteById(bId);
}


// update book

public void updateBook(Book book, int bookId)
 {
     book.setId(bookId);
       bookRepository.save(book);
}
  

}


