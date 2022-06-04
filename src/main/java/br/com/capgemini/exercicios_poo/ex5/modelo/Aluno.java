package br.com.capgemini.exercicios_poo.ex5.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Aluno {
    private String matricula;
    private String nome;
    List<Double> notasProva = new ArrayList<>();
    List<Double> notasTrabalho = new ArrayList<>();

    private final Double PESO_PROVA = 2.5;
    private final Double PESO_TRABALHO = 2.0;


    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public void adicionarNota() {
        Scanner leitor = new Scanner(System.in);
        String atividade;
        Double nota;
        System.out.println("Menu");
        System.out.println("1 - Prova");
        System.out.println("2 - Trabalho");
        System.out.println();
        System.out.println("Digite o número da atividade avaliativa que deseja adicionar a nota: ");
        atividade = leitor.next();
        System.out.println("Digite a nota: ");
        nota = leitor.nextDouble();

        if (atividade.equals("1")) {
            notasProva.add(nota);
        }

        if (atividade.equals("2")) {
            notasTrabalho.add(nota);
        }

    }

    public Integer provaFinal() {
        Double mediaFinal = calcularMediaFinal();
        if (!(mediaFinal >= 7)) {
            System.out.println("Em recuperação! Você necessita de " + (7.0 - mediaFinal) + " na prova final");
            return 1;
        }
        return 0;
    }

    private Double calcularMediaProva() {
        return notasProva.stream().mapToDouble(value -> value * PESO_PROVA).average().orElse(0.0);
    }

    private Double calcularMediaTrabalho() {
        return notasTrabalho.stream().mapToDouble(value -> value * PESO_TRABALHO).average().orElse(0.0);
    }

    public Double calcularMediaFinal() {
        Double mediaTrabalho = calcularMediaTrabalho();
        Double mediaProva = calcularMediaProva();
        int sizeTotal = totalNotas();
        Double mediaFinal = (mediaProva + mediaTrabalho) / sizeTotal;
        return mediaFinal;
    }

    private int totalNotas(){
        return notasProva.size() + notasTrabalho.size();
    }
}
