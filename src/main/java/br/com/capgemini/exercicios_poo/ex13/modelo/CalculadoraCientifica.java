package br.com.capgemini.exercicios_poo.ex13.modelo;

public class CalculadoraCientifica extends Calculadora{

    public Double calculaRaizQuadrada(Double numero){
        return Math.sqrt(numero);
    }

    public Double calculaPotencia(Double numero, Double potencia){
        return Math.pow(numero,potencia);
    }
}
