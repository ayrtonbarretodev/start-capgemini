package br.com.capgemini.exercicios_poo.ex2.service;

import br.com.capgemini.exercicios_poo.ex2.exceptions.SaldoInsuficienteException;
import br.com.capgemini.exercicios_poo.ex2.model.ContaCorrente;

import java.math.BigDecimal;

public class ValidacaoSaldoInsuficiente implements IValidacaoContaCorrente{

    @Override
    public void validar(ContaCorrente contaCorrente, BigDecimal valor) {
        BigDecimal saldoAtual = contaCorrente.getSaldo();
        if (!(valor.compareTo(saldoAtual) == -1)) {
            throw new SaldoInsuficienteException("Impossível sacar um valor maior do que o seu saldo. Seu saldo atual é: " + saldoAtual + " e você está tentando sacar: " + valor);
        }
    }
}
