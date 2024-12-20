package projetoTour.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projetoTour.projeto.model.ReservaHospedagem;
import projetoTour.projeto.repository.ReservaHospedagemRepository;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaHospedagemController {

    @Autowired
    private ReservaHospedagemRepository reservaHospedagemRepository;

    @GetMapping
    public List<ReservaHospedagem> getAllReservas() {
        return reservaHospedagemRepository.findAll();
    }
}
