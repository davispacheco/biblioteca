package com.aula44.biblioteca.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "biblioteca")
public class LivrosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 50, nullable = false)
    private String autor;
    @Column(length = 10, nullable = false)
    private String dataLancamento;
}
