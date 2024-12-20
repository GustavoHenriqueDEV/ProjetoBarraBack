package projetoTour.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import projetoTour.projeto.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
