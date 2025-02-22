package br.com.desafio_spring_inicial.api.controller;


import br.com.desafio_spring_inicial.api.model.Gato;
import br.com.desafio_spring_inicial.api.service.GatoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/gatos")
@RequiredArgsConstructor
public class GatoController {

    private final GatoService gatoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarGato(@RequestBody Gato gato){
        gatoService.criarGato(gato);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Gato> buscarGatoPeloId(@PathVariable Long id){
        return gatoService.buscarGatoPeloId(id);
    }
}
