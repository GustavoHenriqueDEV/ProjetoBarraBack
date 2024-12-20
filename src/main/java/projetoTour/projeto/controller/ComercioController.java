package projetoTour.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projetoTour.projeto.model.Comercio;
import projetoTour.projeto.repository.ComercioRepository;
import projetoTour.projeto.service.ComercioService;

import java.util.List;

@RestController
@RequestMapping("/comercios")
public class ComercioController {

    @Autowired
    private ComercioRepository comercioRepository;

    @Autowired
    private ComercioService comercioService;

    @GetMapping
    public List<Comercio> getAllComercios() {
        return comercioService.getAllComercios();
    }

    @PostMapping
    public Comercio createComercio(@RequestBody Comercio comercio) {
        return comercioRepository.save(comercio);
    }
}
