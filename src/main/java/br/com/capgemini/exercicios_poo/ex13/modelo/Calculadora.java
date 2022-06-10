package br.com.capgemini.exercicios_poo.ex13.modelo;

import br.com.capgemini.exercicios_poo.ex13.interfaces.ICalculadora;

import java.math.BigDecimal;

public class Calculadora implements ICalculadora {

    @Override
    public BigDecimal somar(BigDecimal primeiroNumero, BigDecimal segundoNumero) {
        return primeiroNumero.add(segundoNumero);
    }

    @Override
    public BigDecimal subtrair(BigDecimal primeiroNumero, BigDecimal segundoNumero) {
        return primeiroNumero.subtract(segundoNumero);
    }

    @Override
    public BigDecimal dividir(BigDecimal primeiroNumero, BigDecimal segundoNumero) {
        return primeiroNumero.divide(segundoNumero);
    }

    @Override
    public BigDecimal multiplicar(BigDecimal primeiroNumero, BigDecimal segundoNumero) {
        return primeiroNumero.multiply(segundoNumero);
    }
}
