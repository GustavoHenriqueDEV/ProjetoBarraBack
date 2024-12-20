package projetoTour.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoTour.projeto.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
