package com.api.book.bootrestbook2.controllers;
import java.util.List;
import com.api.book.bootrestbook2.entities.Book;
import com.api.book.bootrestbook2.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
    
    @Autowired
    private BookService bookService;

    // get all books handler
 @GetMapping("/book")
public List <Book >getBook()
{
   
    return this.bookService.getAllBooks();
}

// get single book handler
 @GetMapping( "book/{id}")
  public Book getBook( @PathVariable("id") int id)
  {
      return bookService.getBookById(id);
  }

  // create new book handler
@PostMapping("/book")
  public Book addBook(@RequestBody Book book)
  {
     Book b= this.bookService.addBook(book);
      return b;

  }

  // delete book handler
  @DeleteMapping("/book/{bookId}")
  public void deleteBook( @PathVariable("bookId") int bookId) {
    
    this.bookService.deleteBook(bookId);
  }
  // update book handler
 @PutMapping("/book/{bookId}")
  public Book  updateBook( @RequestBody  Book book ,@PathVariable("bookId") int bookId)
   {
     this.bookService.updateBook( book, bookId);
      return book;
  }




  
}
