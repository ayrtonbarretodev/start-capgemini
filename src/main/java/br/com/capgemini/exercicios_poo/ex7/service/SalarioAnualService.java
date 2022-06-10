package br.com.capgemini.exercicios_poo.ex7.service;

import br.com.capgemini.exercicios_poo.ex7.modelo.Funcionario;

import java.math.BigDecimal;

public class SalarioAnualService {
    private final BigDecimal MESES_DO_ANO = new BigDecimal(12);

    public void calculaSalarioAnual(Funcionario funcionario){
        BigDecimal salarioAnual = funcionario.getSalarioMensal().multiply(MESES_DO_ANO);
        System.out.println("Salário anual: " + salarioAnual);
    }
}
