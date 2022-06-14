package br.com.capgemini.exercicios_poo.ex16;

import br.com.capgemini.exercicios_poo.ex16.modelo.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carroA = new Carro();
        System.out.println("Carro A:");
        System.out.println("Abastecimento 1: ");
        carroA.abastecerCarro(20.0);
        System.out.println("Movendo o carro - 200km");
        carroA.moverCarro(200.0);
        Double qtdCombustivelRestanteA = carroA.quantidadeCombustivel();
        System.out.println("Combustível restante: " + qtdCombustivelRestanteA + " litros");
        Double distanciaPercorridaA = carroA.distanciaPercorrida();
        System.out.println("Distância percorrida: " + distanciaPercorridaA + " km percorridos");

        System.out.println("----------------------------------------------");

        System.out.println("Carro B: ");
        Carro carroB = new Carro();
        System.out.println("Abastecimento 1: ");
        carroB.abastecerCarro(30.0);
        System.out.println("Movendo o carro - 400km");
        carroB.moverCarro(400.0);
        Double qtdCombustivelRestanteB = carroB.quantidadeCombustivel();
        System.out.println("Combustível restante: " + qtdCombustivelRestanteB + " litros");
        Double distanciaPercorridaB = carroB.distanciaPercorrida();
        System.out.println("Distância percorrida: " + distanciaPercorridaB + " km percorridos");

    }
}
