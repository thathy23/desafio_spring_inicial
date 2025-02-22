package br.com.desafio_spring_inicial.api.service;

import br.com.desafio_spring_inicial.api.model.Carro;
import br.com.desafio_spring_inicial.api.repository.CarroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarroService {

    private final CarroRepository carroRepository;

    public void criarCarro(Carro carro){
        carroRepository.save(carro);
    }

    public Optional<Carro> buscarCarroPeloId(Long id){
        return carroRepository.findById(id);
    }
    public List<Carro> buscarTodosCarros(){
        return carroRepository.findAll();
    }
}
