package projetoTour.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import projetoTour.projeto.model.ReservaHospedagem;

public interface ReservaHospedagemRepository extends JpaRepository<ReservaHospedagem, Long> {
}
