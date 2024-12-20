package projetoTour.projeto.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetoTour.projeto.model.Comercio;
import projetoTour.projeto.repository.ComercioRepository;

import java.util.List;

@Service
public class ComercioService {

    private final ComercioRepository comercioRepository;

    public ComercioService(ComercioRepository comercioRepository) {
        this.comercioRepository = comercioRepository;
    }

    public List<Comercio> getAllComercios() {
        return comercioRepository.findAll();
    }

}
