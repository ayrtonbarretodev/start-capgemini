package br.com.capgemini.exercicios_poo.ex12.com_array.modelo;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Agenda {
    private String[] nome = new String[10];
    private int[] idade = new int[10];
    private float[] altura = new float[10];
    int total_agenda = 0;

    private int armazenarPessoa(String nome, int idade, float altura) {
        if (total_agenda < 10) {
            this.nome[this.total_agenda] = nome;
            this.idade[this.total_agenda] = idade;
            this.altura[this.total_agenda] = altura;
            total_agenda++;
            return (total_agenda);
        } else {
            return 0;
        }
    }

    private int buscarPessoa(String wname) {
        int achou = 0;
        for (int i = 0; i < 10; i++) {
            if (wname.equals(this.nome[i])) {
                achou = i + 1;
                break;
            }
        }
        return achou;
    }

    private boolean removerPessoa(String nome) {
        int bp;
        if (total_agenda < 1) {
            return false;
        }
        bp = buscarPessoa(nome);
        if (bp != 0) {
            bp--;
            for (int i = bp; i < total_agenda - 1; i++) {
                this.nome[i] = this.nome[i + 1];
                this.idade[i] = this.idade[i + 1];
                this.altura[i] = this.altura[i + 1];
            }
            this.nome[9] = "";
            this.idade[9] = 0;
            this.altura[9] = 0;
            total_agenda--;
            return true;
        } else {
            return false;
        }
    }

    private void imprimirPessoa(int posicao) {
        int i = posicao - 1;
        if (this.nome[i] != null && this.altura[i] != 0 && this.idade[i] != 0){
            System.out.println(posicao + "/" + nome[i] + "/" + idade[i] + "/" + altura[i]);
        }else {
            System.out.println("Pessoa não encontrada!");
        }
    }

    private void imprimirAgenda() {
        System.out.println("pos/Nome/Idade/Altura");
        for (int i = 0; i < total_agenda; i++) {
            imprimirPessoa(i + 1);
        }
    }

    public void menu(Scanner leitor) {
        int opcao;

        do {
            System.out.println("Menu");
            System.out.println("1 - Nova Pessoa");
            System.out.println("2 - Excluir Pessoa");
            System.out.println("3 - Buscar Pessoa");
            System.out.println("4 - Imprimir Agenda");
            System.out.println("5 - Imprimir Pessoa (Indice)");
            System.out.println("6 - Sair");

            System.out.println("Digite uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite seu nome: ");
                    String nome = leitor.next();
                    System.out.println("Digite sua idade: ");
                    int idade = leitor.nextInt();
                    System.out.println("Digite sua altura: ");
                    float altura = leitor.nextFloat();
                    armazenarPessoa(nome, idade, altura);
                    break;
                case 2:
                    System.out.println("Digite seu nome: ");
                    nome = leitor.next();
                    removerPessoa(nome);
                case 3:
                    System.out.println("Digite seu nome: ");
                    nome = leitor.next();
                    int r = buscarPessoa(nome);
                    System.out.println(r);
                    break;
                case 4:
                    imprimirAgenda();
                    break;
                case 5:
                    System.out.println("Digite o indice: ");
                    int i = leitor.nextInt();
                    imprimirPessoa(i);
                    break;
                case 6:
                    System.out.println("Programa Finalizado");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 6);

    }
}
