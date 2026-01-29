package org.govnorganization.bookmanager.bookmweb.repository;

import org.govnorganization.bookmanager.bookmweb.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BooksRepository extends JpaRepository<Books,Integer> {}
