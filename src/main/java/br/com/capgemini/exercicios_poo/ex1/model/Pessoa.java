package br.com.capgemini.exercicios_poo.ex1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private BigDecimal altura;
}
