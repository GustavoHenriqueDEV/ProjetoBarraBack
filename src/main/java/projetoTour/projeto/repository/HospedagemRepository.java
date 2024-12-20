package projetoTour.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoTour.projeto.model.Hospedagem;

public interface HospedagemRepository extends JpaRepository<Hospedagem, Long> {
}
