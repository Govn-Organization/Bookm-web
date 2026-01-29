package org.govnorganization.bookmanager.bookmweb.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
  @Id @GeneratedValue private int id;

  @Column private String name;

  @Column private LocalDate publication_date;

  @Column private String genre;

  @ManyToOne
  @JoinColumn(name = "autotas_id")
  private Autotas autotas;
}
