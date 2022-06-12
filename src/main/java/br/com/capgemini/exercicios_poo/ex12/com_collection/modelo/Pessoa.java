package br.com.capgemini.exercicios_poo.ex12.com_collection.modelo;

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
