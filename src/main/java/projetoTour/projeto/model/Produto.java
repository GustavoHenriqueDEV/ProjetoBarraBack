package projetoTour.projeto.model;

import jakarta.persistence.*;
import lombok.Data;
import projetoTour.projeto.model.Comercio;

import java.time.LocalDateTime;

@Data
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private Double preco;
    private Boolean disponibilidade;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "comercio_id")
    private Comercio comercio;
}