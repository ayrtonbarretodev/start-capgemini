package br.com.capgemini.exercicios_poo.ex13;

import br.com.capgemini.exercicios_poo.ex13.modelo.Calculadora;
import br.com.capgemini.exercicios_poo.ex13.modelo.CalculadoraCientifica;

import java.math.BigDecimal;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        BigDecimal Rsoma = calculadora.somar(new BigDecimal(10),new BigDecimal(15));
        BigDecimal Rsubtracao = calculadora.subtrair(new BigDecimal(20),new BigDecimal(15));
        BigDecimal Rdivisao = calculadora.dividir(new BigDecimal(20),new BigDecimal(2));
        BigDecimal Rmultiplicacao = calculadora.multiplicar(new BigDecimal(10),new BigDecimal(20));

        System.out.println("Soma: " + Rsoma);
        System.out.println("Subtração: " + Rsubtracao);
        System.out.println("Divisão: " + Rdivisao);
        System.out.println("Multiplicação: " + Rmultiplicacao);

        CalculadoraCientifica calCientifica = new CalculadoraCientifica();
        Double potencia = calCientifica.calculaPotencia(10.0,2.0);
        Double raizQuadrada = calCientifica.calculaRaizQuadrada(16.0);

        System.out.println("Potencia: " + potencia);
        System.out.println("Raiz Quadrada: " + raizQuadrada);

    }
}
