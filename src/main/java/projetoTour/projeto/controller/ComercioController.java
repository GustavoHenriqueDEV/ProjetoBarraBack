package projetoTour.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projetoTour.projeto.model.Comercio;
import projetoTour.projeto.repository.ComercioRepository;

import java.util.List;

@RestController
@RequestMapping("/comercios")
public class ComercioController {

    @Autowired
    private ComercioRepository comercioRepository;

    @GetMapping
    public List<Comercio> getAllComercios() {
        return comercioRepository.findAll();
    }
    @PostMapping
    public Comercio createComercio(@RequestBody Comercio comercio) {
        return comercioRepository.save(comercio);
    }
}
