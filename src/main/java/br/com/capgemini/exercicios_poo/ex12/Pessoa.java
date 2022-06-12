package br.com.capgemini.exercicios_poo.ex12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
}
