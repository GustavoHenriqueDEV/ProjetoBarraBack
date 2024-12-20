package projetoTour.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projetoTour.projeto.model.Hospedagem;
import projetoTour.projeto.repository.HospedagemRepository;

import java.util.List;

@RestController
@RequestMapping("/hospedagens")
public class HospedagemController {

    @Autowired
    private HospedagemRepository hospedagemRepository;

    @GetMapping
    public List<Hospedagem> getAllHospedagens() {
        return hospedagemRepository.findAll();
    }

    @PostMapping
    public Hospedagem createHospedagem(@RequestBody Hospedagem hospedagem) {
        return hospedagemRepository.save(hospedagem);
    }
}