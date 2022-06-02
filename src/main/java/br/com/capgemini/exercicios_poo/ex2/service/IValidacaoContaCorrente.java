package br.com.capgemini.exercicios_poo.ex2.service;

import br.com.capgemini.exercicios_poo.ex2.model.ContaCorrente;

import java.math.BigDecimal;

public interface IValidacaoContaCorrente {
    void validar(ContaCorrente contaCorrente,BigDecimal valor);
}
