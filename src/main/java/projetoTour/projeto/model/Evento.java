package projetoTour.projeto.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "evento") // Nome explícito da tabela no banco de dados
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "descricao", length = 500)
    private String descricao;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    @Column(name = "localizacao", length = 255)
    private String localizacao;

    @Column(name = "taxa_entrada", nullable = false)
    private Boolean taxaEntrada;

    @Column(name = "valor_entrada")
    private Double valorEntrada;

    @Column(name = "destaque", nullable = false)
    private Boolean destaque;

    @Column(name = "contato", length = 50)
    private String contato;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    // Construtor padrão
    public Evento() {
    }

    // Construtor parametrizado
    public Evento(Long id, String nome, String descricao, LocalDate dataInicio, LocalDate dataFim,
                  String localizacao, Boolean taxaEntrada, Double valorEntrada, Boolean destaque,
                  String contato, LocalDateTime createdAt) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.localizacao = localizacao;
        this.taxaEntrada = taxaEntrada;
        this.valorEntrada = valorEntrada;
        this.destaque = destaque;
        this.contato = contato;
        this.createdAt = createdAt;
    }
}
