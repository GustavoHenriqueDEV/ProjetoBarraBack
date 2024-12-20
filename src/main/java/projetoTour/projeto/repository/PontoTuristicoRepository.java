package projetoTour.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoTour.projeto.model.PontoTuristico;

public interface PontoTuristicoRepository extends JpaRepository<PontoTuristico, Long> {
}
