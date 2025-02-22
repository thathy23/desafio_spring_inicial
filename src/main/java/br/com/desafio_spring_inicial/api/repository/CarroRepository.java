package br.com.desafio_spring_inicial.api.repository;

import br.com.desafio_spring_inicial.api.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
}
