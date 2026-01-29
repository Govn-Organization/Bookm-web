package org.govnorganization.bookmanager.bookmweb.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Autotas {
  @Id @GeneratedValue private int id;

  @OneToMany(mappedBy = "autotas")
  private List<Books> books = new ArrayList<>();

  @Column private String name;
  @Column private String last_name;
  @Column private LocalDate date_of_birth;
}
