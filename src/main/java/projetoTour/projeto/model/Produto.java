package projetoTour.projeto.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Produto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(int disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Comercio getComercio() {
        return comercio;
    }

    public void setComercio(Comercio comercio) {
        this.comercio = comercio;
    }

    @Column(name = "nome")
    private String nome;

    @Column (name = "disponibilidade")
    private int disponibilidade;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "preco")
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "comercio_id") // Chave estrangeira para 'comercio'
    private Comercio comercio;

    // Construtores, getters e setters

    public Produto(Long id, String nome, int disponibilidade, String descricao, Double preco, Comercio comercio) {
        this.id = id;
        this.nome = nome;
        this.disponibilidade = disponibilidade;
        this.descricao = descricao;
        this.preco = preco;
        this.comercio = comercio;
    }
}
