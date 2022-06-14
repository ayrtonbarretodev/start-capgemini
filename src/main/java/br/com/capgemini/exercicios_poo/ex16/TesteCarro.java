package br.com.capgemini.exercicios_poo.ex16;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.abastecerCarro(40.0);
        carro.moverCarro(200.0);
        carro.moverCarro(100.0);

        Double qtdCombustivel = carro.quantidadeCombustivel();
        System.out.println(qtdCombustivel);

        System.out.println();

        Double distanciaPercorrida = carro.distanciaPercorrida();
        System.out.println(distanciaPercorrida);

    }
}
