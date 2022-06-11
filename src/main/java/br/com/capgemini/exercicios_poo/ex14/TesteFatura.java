package br.com.capgemini.exercicios_poo.ex14;

import br.com.capgemini.exercicios_poo.ex14.modelo.Fatura;

public class TesteFatura {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.setNumero("2022111");
        fatura.setDescricao("Cartão de Crédito");
        fatura.setQuantidade(5);
        fatura.setPrecoUnitario(100.0);

        Double totalFaturaMes = fatura.getTotalFatura();
        System.out.println("Total da fatura neste mês: " + totalFaturaMes);
    }
}
