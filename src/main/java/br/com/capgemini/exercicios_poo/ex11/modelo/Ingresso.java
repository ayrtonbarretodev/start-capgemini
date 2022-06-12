package br.com.capgemini.exercicios_poo.ex11.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class Ingresso {
    private BigDecimal valor;

    public void imprimirValor(){
        System.out.println("Valor do ingresso normal: " + valor);
    }
}
