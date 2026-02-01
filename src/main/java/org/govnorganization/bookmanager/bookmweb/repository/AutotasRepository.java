package org.govnorganization.bookmanager.bookmweb.repository;

import org.govnorganization.bookmanager.bookmweb.entity.Autotas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutotasRepository extends JpaRepository<Autotas,Integer> {

}
