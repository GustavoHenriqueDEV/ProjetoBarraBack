package projetoTour.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoTour.projeto.model.Comercio;

public interface ComercioRepository extends JpaRepository<Comercio, Long> {
}
