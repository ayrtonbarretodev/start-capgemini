package br.com.capgemini.exercicios_poo.ex5;

import br.com.capgemini.exercicios_poo.ex5.modelo.Aluno;

public class TesteAluno {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("2022002102", "Ayrton");
        aluno.adicionarNota();
        aluno.adicionarNota();
        aluno.adicionarNota();
        Double mediaFinal = aluno.calcularMediaFinal();
        System.out.println("Média final: " + mediaFinal);

        Integer verificaSituacaoAluno = aluno.provaFinal();

        if (verificaSituacaoAluno == 0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Recuperação");
        }

    }
}
