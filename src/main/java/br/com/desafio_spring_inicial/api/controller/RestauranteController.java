package br.com.desafio_spring_inicial.api.controller;

import br.com.desafio_spring_inicial.api.model.Restaurante;
import br.com.desafio_spring_inicial.api.service.RestauranteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/restaurantes")
@RequiredArgsConstructor
public class RestauranteController {

    private final RestauranteService restauranteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarRestaurante(@RequestBody Restaurante restaurante){
        restauranteService.criarRestaurante(restaurante);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Restaurante> buscarRestaurantePeloId(@PathVariable Long id){
        return restauranteService.buscarRestaurantePeloId(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Restaurante> buscarTodosRestaurantes(){
        return restauranteService.buscarTodosRestaurantes();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarRestaurantePeloId(@PathVariable Long id) {
        restauranteService.deletarRestaurantePeloId(id);
    }
}
