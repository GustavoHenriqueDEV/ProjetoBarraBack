package projetoTour.projeto.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Hospedagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String tipo; // Hotel, Pousada, Airbnb
    private String endereco;
    private String telefone;
    private String email;
    private String descricao;
    private Double precoMedioDiaria;
    private Double notaAvaliacao;
    private Boolean destaque;
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "hospedagem")
    private List<ReservaHospedagem> reservas;
}