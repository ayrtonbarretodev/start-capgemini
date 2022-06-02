package br.com.capgemini.exercicios_poo.ex2.service;

import br.com.capgemini.exercicios_poo.ex2.exceptions.ValorNegativoException;
import br.com.capgemini.exercicios_poo.ex2.model.ContaCorrente;

import java.math.BigDecimal;

public class ValidacaoValorNegativo implements IValidacaoContaCorrente{

    @Override
    public void validar(ContaCorrente contaCorrente, BigDecimal valor) {
        if (!(valor.compareTo(BigDecimal.ZERO) > 0)) {
            throw new ValorNegativoException("O valor precisa ser maior que zero");
        }
    }
}
