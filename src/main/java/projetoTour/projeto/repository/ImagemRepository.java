package projetoTour.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoTour.projeto.model.Imagem;

public interface ImagemRepository extends JpaRepository<Imagem, Long> {
}
