package co.edu.eam.disenosoftware.biblioteca.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "prestamo")
public class Borrow implements Serializable {
  @Id
  @Column(name = "id")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "id_usuario", referencedColumnName = "user_identification")
  private User user;

  @ManyToOne
  @JoinColumn(name = "id_libro", referencedColumnName = "codigo_libro")
  private Book book;

  @Column(name = "fecha_prestamo")
  private Date dateTime;

  public Borrow() {
  }
}