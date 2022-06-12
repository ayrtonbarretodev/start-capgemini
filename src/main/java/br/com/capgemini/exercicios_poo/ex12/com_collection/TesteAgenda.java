package br.com.capgemini.exercicios_poo.ex12.com_collection;

import br.com.capgemini.exercicios_poo.ex12.com_collection.modelo.Agenda;
import br.com.capgemini.exercicios_poo.ex12.com_collection.modelo.Pessoa;

public class TesteAgenda {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ayrton",28,1.77f);
        Pessoa pessoa2 = new Pessoa("Ana",56,1.65f);
        Pessoa pessoa3 = new Pessoa("Amanda",28,1.77f);
        Pessoa pessoa4 = new Pessoa("Victor",28,1.77f);
        Pessoa pessoa5 = new Pessoa("João",28,1.77f);

        Agenda agenda = new Agenda();
        agenda.adicionarPessoa(pessoa1);
        agenda.adicionarPessoa(pessoa3);
        agenda.adicionarPessoa(pessoa4);
        agenda.adicionarPessoa(pessoa5);
        agenda.buscarPessoa("Ayrton");

        System.out.println();

        agenda.imprimirAgenda();

        System.out.println();

        agenda.adicionarPessoa(pessoa2);
        agenda.imprimirPessoa(pessoa2);

        System.out.println();
        System.out.println("Removendo pessoa4 - Victor");
        agenda.removerPessoa(pessoa4);

        System.out.println();

        agenda.imprimirAgenda();
    }
}
