package br.com.capgemini.exercicios_poo.ex11;

import br.com.capgemini.exercicios_poo.ex11.modelo.Ingresso;
import br.com.capgemini.exercicios_poo.ex11.modelo.IngressoVip;

import java.math.BigDecimal;

public class TesteIngresso {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new Ingresso(new BigDecimal(100));
        ingressoNormal.imprimirValor();

        Ingresso ingressoVip = new IngressoVip(new BigDecimal(100), new BigDecimal(1.10));
        ingressoVip.imprimirValor();
    }
}
