package br.com.capgemini.exercicios_poo.ex4;

import br.com.capgemini.exercicios_poo.ex4.modelo.Elevador;

public class TesteElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        elevador.inicializar(10, 5);

        System.out.println("Entrando 3 pessoas no elevador: ");
        elevador.entrarNoElevador();
        elevador.entrarNoElevador();
        elevador.entrarNoElevador();

        System.out.println();

        System.out.println("Saindo 1 pessoa do elevador: ");
        elevador.sairDoElevador();

        System.out.println();

        elevador.verificarQuantidadePessoasNoElevador();

        System.out.println();

        elevador.verificarAndarAtual();

        System.out.println("Subindo até o último andar ...");
        for (int i = 0; i < elevador.getTotalAndares(); i++) {
            elevador.subir();
        }

        elevador.verificarAndarAtual();

        System.out.println("Descendo 3 andares ...");
        for (int i = 0; i < 3; i++) {
            elevador.descer();
        }

        elevador.verificarAndarAtual();

    }
}
