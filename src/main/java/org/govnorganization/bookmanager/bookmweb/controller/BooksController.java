package org.govnorganization.bookmanager.bookmweb.controller;


import org.govnorganization.bookmanager.bookmweb.service.BooksService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookm-web")
public class BooksController {
    private final BooksService booksService;
    public   BooksController (BooksService booksService)
    {
        this.booksService = booksService;
    }

    @GetMapping
    public String getStatus(){
        return "app is up";
    }

    
    @GetMapping("/hel")
    public ResponseEntity<?> getAllBooks(){
        return ResponseEntity.ok(booksService.getAllBooksService());
    }




}
