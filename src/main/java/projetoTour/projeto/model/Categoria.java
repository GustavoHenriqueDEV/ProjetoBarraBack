package projetoTour.projeto.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "categoria") // Nome da tabela no banco de dados
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "tipo", nullable = false, length = 50) // Produto, Turismo
    private String tipo;

    @Column(name = "descricao", length = 500)
    private String descricao;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    // Construtor padrão
    public Categoria() {
    }

    // Construtor com todos os atributos
    public Categoria(Long id, String nome, String tipo, String descricao, LocalDateTime createdAt) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.createdAt = createdAt;
    }
}
