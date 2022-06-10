package br.com.capgemini.exercicios_poo.ex7;

import br.com.capgemini.exercicios_poo.ex7.modelo.Funcionario;
import br.com.capgemini.exercicios_poo.ex7.service.ReajusteService;
import br.com.capgemini.exercicios_poo.ex7.service.SalarioAnualService;

import java.math.BigDecimal;

public class Teste {
    public static void main(String[] args) {
        Funcionario funcionarioOne = new Funcionario("Ayrton", "Barreto", new BigDecimal(300));
        System.out.println("Salário mensal: " + funcionarioOne.getSalarioMensal());

        SalarioAnualService salarioAnualService = new SalarioAnualService();
        salarioAnualService.calculaSalarioAnual(funcionarioOne);

        System.out.println();

        Funcionario funcionarioTwo = new Funcionario("Albert", "Einste", new BigDecimal(200));
        System.out.println("Salário mensal: " + funcionarioTwo.getSalarioMensal());
        salarioAnualService.calculaSalarioAnual(funcionarioTwo);

        System.out.println();

        ReajusteService reajusteService = new ReajusteService();
        reajusteService.calculaReajuste(funcionarioOne, new BigDecimal(10));
        System.out.println("Salário reajustado: " + funcionarioOne.getSalarioMensal());

        System.out.println();

        reajusteService.calculaReajuste(funcionarioTwo, new BigDecimal(10));
        System.out.println("Salário reajustado: " + funcionarioTwo.getSalarioMensal());
    }
}