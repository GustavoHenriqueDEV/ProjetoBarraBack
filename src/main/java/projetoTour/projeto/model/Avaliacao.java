package projetoTour.projeto.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "avaliacao") // Nome da tabela no banco de dados
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nota", nullable = false)
    private Integer nota; // 1 a 5

    @Column(name = "comentario", length = 500) // Limite de caracteres para o comentário
    private String comentario;

    @Column(name = "data_avaliacao", nullable = false)
    private LocalDate dataAvaliacao;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Column(name = "entidade_id", nullable = false)
    private Long entidadeId; // ID do Comércio, Ponto Turístico ou Hospedagem

    @Column(name = "tipo_entidade", nullable = false, length = 50)
    private String tipoEntidade; // Comercio, PontoTuristico, Hospedagem

    // Construtor padrão
    public Avaliacao() {
    }

    // Construtor com todos os atributos
    public Avaliacao(Long id, Integer nota, String comentario, LocalDate dataAvaliacao, LocalDateTime createdAt,
                     Usuario usuario, Long entidadeId, String tipoEntidade) {
        this.id = id;
        this.nota = nota;
        this.comentario = comentario;
        this.dataAvaliacao = dataAvaliacao;
        this.createdAt = createdAt;
        this.usuario = usuario;
        this.entidadeId = entidadeId;
        this.tipoEntidade = tipoEntidade;
    }
}
