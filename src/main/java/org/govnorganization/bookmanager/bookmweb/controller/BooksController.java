package org.govnorganization.bookmanager.bookmweb.controller;

import lombok.extern.slf4j.Slf4j;
import org.govnorganization.bookmanager.bookmweb.service.BooksService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/bookm-web")
public class BooksController {
  private final BooksService booksService;

  public BooksController(BooksService booksService) {
    this.booksService = booksService;
  }

  @GetMapping
  public String getStatus() {
    log.info("app is up");
    return "redirect:/books";
  }

  @GetMapping("/books")
  public ResponseEntity<?> getAllBooks() {
    return ResponseEntity.ok(booksService.getAllBooksService());
  }
}
