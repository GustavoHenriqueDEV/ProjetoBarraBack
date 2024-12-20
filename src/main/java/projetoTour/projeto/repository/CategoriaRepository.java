package projetoTour.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoTour.projeto.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
