package org.govnorganization.bookmanager.bookmweb.controller;


import org.govnorganization.bookmanager.bookmweb.service.BooksService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookm-web")
public class BooksController {
    private final BooksService booksService;
    public   BooksController (BooksService booksService)
    {
        this.booksService = booksService;
    }

    @GetMapping
    public ResponseEntity<?> getAllBooks(){
        return ResponseEntity.ok(booksService.getAllBooksService());
    }




}
