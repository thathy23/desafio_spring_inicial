package br.com.desafio_spring_inicial.api.model;

import br.com.desafio_spring_inicial.api.enums.TipoCachorroEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cachorro")
@Entity
public class Cachorro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "idade", nullable = false, length = 3)
    private Integer idade;

    @Column(name = "raca", nullable = false, length = 100)
    private String raca;

   @Column(name = "tipo_cachorro", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoCachorroEnum tipoCachorro;
}
