package co.edu.eam.disenosoftware.biblioteca.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "libro")
public class Book implements Serializable {

  @Id
  @Column(name = "codigo_libro")
  private String code;

  @Column(name = "nombre_libro")
  private String name;

  @Column(name = "isbn_libro")
  private String isbn;

  @ManyToOne
  @JoinColumn(name = "id_editorial", referencedColumnName = "codigo_editorial")
  private Publisher publisher;

  public Book() {
  }
}