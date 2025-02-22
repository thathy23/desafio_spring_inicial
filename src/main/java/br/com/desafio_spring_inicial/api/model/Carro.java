package br.com.desafio_spring_inicial.api.model;

import br.com.desafio_spring_inicial.api.enums.TipoCarroEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "carro")
@Entity
public class Carro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "carro", nullable = false, length = 100)
    private String marca;

    @Column(name = "modelo", nullable = false, length = 100)
    private String modelo;

    @Column(name = "ano", nullable = false, length = 4)
    private Integer ano;

    @Column(name = "tipo_carro", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoCarroEnum tipoCarro;
}
