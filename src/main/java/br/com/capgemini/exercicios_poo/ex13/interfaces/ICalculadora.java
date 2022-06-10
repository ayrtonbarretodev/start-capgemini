package br.com.capgemini.exercicios_poo.ex13.interfaces;

import java.math.BigDecimal;

public interface ICalculadora {

    BigDecimal somar(BigDecimal primeiroNumero, BigDecimal segundoNumero);
    BigDecimal subtrair(BigDecimal primeiroNumero, BigDecimal segundoNumero);
    BigDecimal dividir(BigDecimal primeiroNumero, BigDecimal segundoNumero);
    BigDecimal multiplicar(BigDecimal primeiroNumero, BigDecimal segundoNumero);
}
