package br.com.desafio_spring_inicial.api.service;

import br.com.desafio_spring_inicial.api.model.Restaurante;
import br.com.desafio_spring_inicial.api.repository.RestauranteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RestauranteService {

    private final RestauranteRepository restauranteRepository;

    public void criarRestaurante(Restaurante restaurante){

        restauranteRepository.save(restaurante);
    }

    public Optional<Restaurante> buscarRestaurantePeloId(Long id){
        return restauranteRepository.findById(id);
    }

    public List<Restaurante> buscarTodosRestaurantes() {
        return restauranteRepository.findAll();
    }

    public void deletarRestaurantePeloId(Long id) {
        restauranteRepository.deleteById(id);
    }

}
