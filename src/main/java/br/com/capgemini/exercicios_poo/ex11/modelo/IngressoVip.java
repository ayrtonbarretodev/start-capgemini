package br.com.capgemini.exercicios_poo.ex11.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IngressoVip extends Ingresso{
    private BigDecimal valorAdicional;

    public IngressoVip(BigDecimal valor,BigDecimal valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public void imprimirValor() {
        BigDecimal valorReajustado = this.getValor().multiply(valorAdicional).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Valor do ingresso vip: " + valorReajustado);
    }
}
