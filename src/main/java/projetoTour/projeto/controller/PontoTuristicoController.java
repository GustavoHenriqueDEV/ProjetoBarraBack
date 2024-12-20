package projetoTour.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projetoTour.projeto.model.PontoTuristico;
import projetoTour.projeto.repository.PontoTuristicoRepository;

import java.util.List;

@RestController
@RequestMapping("/pontos-turisticos")
public class PontoTuristicoController {

    @Autowired
    private PontoTuristicoRepository pontoTuristicoRepository;

    @GetMapping
    public List<PontoTuristico> getAllPontosTuristicos() {
        return pontoTuristicoRepository.findAll();
    }

    @PostMapping
    public PontoTuristico createPontoTuristico(@RequestBody PontoTuristico pontoTuristico) {
        return pontoTuristicoRepository.save(pontoTuristico);
    }
}
