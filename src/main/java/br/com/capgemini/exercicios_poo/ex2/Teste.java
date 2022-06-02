package br.com.capgemini.exercicios_poo.ex2;

import br.com.capgemini.exercicios_poo.ex2.model.ContaCorrente;

import java.math.BigDecimal;

public class Teste {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("202200021", "Ayrton Barreto");
        System.out.println("Verificando Saldo Inicial: ");
        contaCorrente.verificarSaldo();

        System.out.println();

        System.out.println("Realizando um depósito de 100 reais e verificando novamento o saldo: ");
        contaCorrente.depositar(new BigDecimal(100));
        contaCorrente.verificarSaldo();

        System.out.println();

//        System.out.println("Tentando sacar um valor além do que disponivel em conta: ");
//        contaCorrente.sacar(new BigDecimal(200));
//        System.out.println("Tentando sacar um valor negativo: ");
//        contaCorrente.sacar(new BigDecimal(-1));
//        System.out.println("Realizando um saque no valor de 50 reais: ");
        contaCorrente.sacar(new BigDecimal(50));

        System.out.println();

        System.out.println("Verificando o saldo após o saque de 50 reais: ");
        contaCorrente.verificarSaldo();

        System.out.println();

        System.out.println("Alterando o nome do titular da Conta Corrente: ");
        contaCorrente.alterarNome("Arthur Barreto");

        System.out.println("Novo nome: " + contaCorrente.getTitular());


    }
}
