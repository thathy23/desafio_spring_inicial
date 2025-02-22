package br.com.desafio_spring_inicial.api.controller;

import br.com.desafio_spring_inicial.api.model.Carro;
import br.com.desafio_spring_inicial.api.service.CarroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carros")
@RequiredArgsConstructor
public class CarroController {

    private final CarroService carroService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarCarro(@RequestBody Carro carro){
        carroService.criarCarro(carro);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Carro> buscarCarroPeloId(@PathVariable Long id){
        return carroService.buscarCarroPeloId(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Carro> buscarTodosCarros(){
        return carroService.buscarTodosCarros();
    }
}
