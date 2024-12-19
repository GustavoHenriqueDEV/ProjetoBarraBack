package projetoTour.projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class PontoTuristico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private String localizacao; // Latitude, Longitude
    private String endereco;
    private String horarioFuncionamento;
    private Boolean taxaEntrada;
    private Double valorEntrada;
    private String contato;
    private Boolean destaque;
    private LocalDateTime createdAt;
}