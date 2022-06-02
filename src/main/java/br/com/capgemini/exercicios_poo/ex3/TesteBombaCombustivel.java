package br.com.capgemini.exercicios_poo.ex3;

import br.com.capgemini.exercicios_poo.ex3.model.BombaCombustivel;

import java.math.BigDecimal;

public class TesteBombaCombustivel {
    public static void main(String[] args) {
        BombaCombustivel bc = new BombaCombustivel("S10",new BigDecimal(4),new BigDecimal(200));


        System.out.println("Quantidade de combustivel: ");
        System.out.println(bc.getQuantidadeCombustivel());

        System.out.println();

        bc.abastecerPorValor(new BigDecimal(80)); //20
        bc.abastecerPorLitro(new BigDecimal(20)); //80

        System.out.println();

        System.out.println("Quantidade de combustivel: ");
        System.out.println(bc.getQuantidadeCombustivel());

        System.out.println();

        bc.alterarValorDoCombustivel(new BigDecimal(5));
        bc.abastecerPorValor(new BigDecimal(80)); //20
        bc.abastecerPorLitro(new BigDecimal(20)); //80

        System.out.println();

        bc.alterarTipoDoCombustivel("S20");
        System.out.println(bc.getTipoCombustivel());

        System.out.println();

        System.out.println("Quantidade de combustivel: ");
        System.out.println(bc.getQuantidadeCombustivel());

        //bc.abastecerPorValor(new BigDecimal(0));

    }
}
