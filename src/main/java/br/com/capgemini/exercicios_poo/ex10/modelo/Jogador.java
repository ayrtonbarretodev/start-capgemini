package br.com.capgemini.exercicios_poo.ex10.modelo;

import br.com.capgemini.exercicios_poo.ex10.enums.Posicao;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Jogador {
    private String nome;
    private Posicao posicao;
    LocalDate dataNascimento;
    private String nacionalidade;
    private Double altura;
    private Double peso;
}
