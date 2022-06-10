package br.com.capgemini.exercicios_poo.ex7.modelo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class Funcionario {
    @Getter
    @Setter
    private String nome;
    @Getter
    @Setter
    private String sobrenome;
    @Getter
    @Setter
    private BigDecimal salarioMensal;


    public Funcionario(String nome, String sobrenome, BigDecimal salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (salarioMensal.compareTo(BigDecimal.ZERO) < 0) {
            this.salarioMensal = BigDecimal.ZERO;
        } else {
            this.salarioMensal = salarioMensal;
        }
    }

    public void reajustarSalario(BigDecimal novoSalario) {
        this.salarioMensal = novoSalario;
    }

//    public void salarioAnual() {
//        BigDecimal salarioAnual = this.salarioMensal.multiply(MESES_DO_ANO);
//        System.out.println("Salário anual: " + salarioAnual);
//    }

}
