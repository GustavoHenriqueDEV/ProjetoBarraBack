package projetoTour.projeto.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer nota; // 1 a 5
    private String comentario;
    private LocalDate dataAvaliacao;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private Long entidadeId; // ID do Comércio, Ponto Turístico ou Hospedagem
    private String tipoEntidade; // Comercio, PontoTuristico, Hospedagem
}