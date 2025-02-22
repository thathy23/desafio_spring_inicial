package br.com.desafio_spring_inicial.api.model;

import br.com.desafio_spring_inicial.api.enums.TipoGatoEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Table(name = "gato")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Gato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;


    @Column(name = "cor", nullable = false, length = 100)
    private String cor;


    @Column(name = "peso", nullable = false, length = 10)
    private Double peso;

    @Column(name = "tipo_gato", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoGatoEnum tipoGato;

}
