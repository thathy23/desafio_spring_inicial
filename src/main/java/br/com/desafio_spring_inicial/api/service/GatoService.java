package br.com.desafio_spring_inicial.api.service;


import br.com.desafio_spring_inicial.api.model.Gato;
import br.com.desafio_spring_inicial.api.repository.GatoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GatoService {

    private final GatoRepository gatoRepository;

    public void criarGato(Gato gato){
        gatoRepository.save(gato);
    }

    public Optional<Gato> buscarGatoPeloId(Long id){
        return gatoRepository.findById(id);
    }

    public List<Gato> buscarTodosGatos() {
        return gatoRepository.findAll();
    }
}
