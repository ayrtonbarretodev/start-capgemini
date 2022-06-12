package br.com.capgemini.exercicios_poo.ex12.com_array;

import br.com.capgemini.exercicios_poo.ex12.com_array.modelo.Agenda;

import java.util.Scanner;

public class TesteAgendaArray {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner leitor = new Scanner(System.in);
        agenda.menu(leitor);
    }
}
