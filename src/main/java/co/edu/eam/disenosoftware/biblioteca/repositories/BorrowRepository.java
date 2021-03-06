package co.edu.eam.disenosoftware.biblioteca.repositories;

import co.edu.eam.disenosoftware.biblioteca.model.entities.Borrow;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class BorrowRepository {

  @PersistenceContext
  private EntityManager em;

  /**
   * Consulta 2: Préstamos de un usuario
   *
   * @param userIdentification
   * @return
   */
  public List<Borrow> getBorrowsByUserId(String userIdentification) {
    return null;
  }

  /**
   * Consutla 4: Préstamos de un libro
   *
   * @param bookCode
   * @return
   */
  public List<Borrow> getBorrowsByBookId(String bookCode) {
    return null;
  }

}
