package projetoTour.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoTour.projeto.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
