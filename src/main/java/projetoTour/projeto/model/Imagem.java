package projetoTour.projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Imagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;
    private Long entidadeId; // ID do Comércio, Ponto Turístico, Produto, Hospedagem ou Evento
    private String tipoEntidade; // Comercio, PontoTuristico, Produto, Hospedagem, Evento
    private LocalDateTime createdAt;
}