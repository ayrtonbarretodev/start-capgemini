package br.com.capgemini.exercicios_poo.ex2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
public class Titular {
    private String nome;

    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }
}
