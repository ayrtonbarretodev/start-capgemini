package br.com.capgemini.exercicios_poo.ex9;

import br.com.capgemini.exercicios_poo.ex8.Data;
import br.com.capgemini.exercicios_poo.ex9.modelo.Voo;

import java.time.LocalDate;

public class TesteVoo {
    public static void main(String[] args) {
        Data data = new Data(LocalDate.now());
        Voo voo = new Voo("2022",data);

        System.out.println("Verificando poltronas");
        voo.verificarCadeiras();

        System.out.println();

        System.out.println("Verificando disponibilidade: ");
        boolean r = voo.verificarDisponibilidade(1,1);
        System.out.println(r);

        System.out.println();

        System.out.println("Adicionando 3 passageiros: ");
        voo.ocupaCadeira(1,1);
        voo.ocupaCadeira(2,1);
        voo.ocupaCadeira(3,1);

        System.out.println();

        System.out.println("Número de vagas no voo: ");
        int vaga = voo.calculaVagas();
        System.out.println(vaga);

        System.out.println();

        System.out.println("Número do voo:");
        System.out.println(voo.getNumero());

        System.out.println();

        System.out.println("Verificando poltronas");
        voo.verificarCadeiras();

        System.out.println();

        System.out.println("Verificando próxima cadeira livre: ");
        String proximaLivre = voo.retornaProximaCadeiraLivre();
        System.out.println(proximaLivre);
    }
}
