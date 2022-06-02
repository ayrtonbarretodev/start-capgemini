package br.com.capgemini.exercicios_poo.ex3.exceptions;

public class ValorNegativoException extends RuntimeException{
    public ValorNegativoException(String message) {
        super(message);
    }
}
