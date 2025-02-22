package br.com.desafio_spring_inicial.api.model;

import br.com.desafio_spring_inicial.api.enums.TipoRestauranteEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "restaurante")
@Entity
public class Restaurante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "cozinha", nullable = false, length = 100)
    private String cozinha;

    @Column(name = "nota", nullable = false, length = 3)
    private String nota;

    @Column(name = "tipo_restaurante", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoRestauranteEnum tipoRestaurante;
}
