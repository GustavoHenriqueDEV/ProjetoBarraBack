package projetoTour.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projetoTour.projeto.model.Comercio;
import projetoTour.projeto.service.ComercioService;

import java.util.List;

@RestController
@RequestMapping("/comercios")
public class ComercioController {

    @Autowired
    private ComercioService comercioService;

    @GetMapping
    public List<Comercio> retonarTodosComercios() {
        return comercioService.getAllComercios();
    }
}
