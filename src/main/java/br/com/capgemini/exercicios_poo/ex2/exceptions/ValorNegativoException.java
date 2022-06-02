package br.com.capgemini.exercicios_poo.ex2.exceptions;

public class ValorNegativoException extends RuntimeException{
    public ValorNegativoException(String message) {
        super(message);
    }
}
