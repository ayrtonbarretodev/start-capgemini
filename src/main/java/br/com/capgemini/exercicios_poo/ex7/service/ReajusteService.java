package br.com.capgemini.exercicios_poo.ex7.service;

import br.com.capgemini.exercicios_poo.ex7.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void calculaReajuste(Funcionario funcionario, BigDecimal porcentagem){
        porcentagem = porcentagem.divide(new BigDecimal(100)).add(BigDecimal.ONE);
        BigDecimal salarioReajustado = funcionario.getSalarioMensal().multiply(porcentagem);
        funcionario.reajustarSalario(salarioReajustado);
    }
}
