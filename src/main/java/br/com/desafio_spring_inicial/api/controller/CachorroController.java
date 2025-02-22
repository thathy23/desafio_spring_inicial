package br.com.desafio_spring_inicial.api.controller;


import br.com.desafio_spring_inicial.api.model.Cachorro;
import br.com.desafio_spring_inicial.api.service.CachorroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cachorros")
@RequiredArgsConstructor
public class CachorroController {

    private final CachorroService cachorroService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarCachorro(@RequestBody Cachorro cachorro){
        cachorroService.criarCachorro(cachorro);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Cachorro> buscarCachorroPeloId(@PathVariable Long id){
        return cachorroService.buscarCachorroPeloId(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cachorro> buscarTodosCachorros() {
        return cachorroService.buscarTodosCachorros();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarCachorroPeloId(@PathVariable Long id){
        cachorroService.deletarCachorroPeloId(id);
    }
}
