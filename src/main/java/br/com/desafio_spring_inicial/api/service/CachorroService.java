package br.com.desafio_spring_inicial.api.service;

import br.com.desafio_spring_inicial.api.model.Cachorro;
import br.com.desafio_spring_inicial.api.repository.CachorroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CachorroService {

    private final CachorroRepository cachorroRepository;

    public void criarCachorro (Cachorro cachorro) {
        cachorroRepository.save(cachorro);
    }

    public Optional<Cachorro> buscarCachorroPeloId(Long id){
        return cachorroRepository.findById(id);
    }


}
