package br.com.capgemini.exercicios_poo.ex15;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Ayrton");
        f1.setSobrenome("Barreto");
        f1.setSalarioMensal(500.0);
        Funcionario f2 = new Funcionario();
        f2.setNome("Hilton");
        f2.setSobrenome("Barreto");
        f2.setSalarioMensal(1500.0);

        f1.reajusteSalarial();
        f2.reajusteSalarial();

        System.out.println();

        System.out.println("Salario anual do funcionário " + f1.getNome());
        f1.calculaSalarioAnual();

        System.out.println("Salario anual do funcionário " + f2.getNome());
        f2.calculaSalarioAnual();

        System.out.println("Quantidade de funcionários cadastrados na empresa: " + Funcionario.quantidadeFuncionario);

    }
}
