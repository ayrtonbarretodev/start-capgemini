package br.com.capgemini.exercicios_poo.ex15;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Funcionario {
    private String nome;
    private String sobrenome;
    private Double salarioMensal;
    static int quantidadeFuncionario;

    public Funcionario() {
        quantidadeFuncionario++;
    }

    public void reajusteSalarial() {
        this.salarioMensal *= 1.1;
    }

    public void calculaSalarioAnual() {
        System.out.println("O seu salário anual é: " + (this.salarioMensal * 12));
    }
}
