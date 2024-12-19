package projetoTour.projeto.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String tipo; // Visitante, Comerciante, Administrador
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "usuario")
    private List<Comercio> comercios;

    @OneToMany(mappedBy = "usuario")
    private List<ReservaHospedagem> reservas;

    @OneToMany(mappedBy = "usuario")
    private List<Avaliacao> avaliacoes;

    // Getters and Setters
}