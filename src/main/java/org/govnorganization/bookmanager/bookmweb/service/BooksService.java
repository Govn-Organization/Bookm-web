package org.govnorganization.bookmanager.bookmweb.service;


import lombok.extern.slf4j.Slf4j;
import org.govnorganization.bookmanager.bookmweb.entity.Books;
import org.govnorganization.bookmanager.bookmweb.repository.BooksRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BooksService {
    private final BooksRepository booksRepository;
    public BooksService(BooksRepository booksRepository){
        this.booksRepository = booksRepository;
    }


    public List<Books> getAllBooksService(){

       return booksRepository.findAll();
    }


}
