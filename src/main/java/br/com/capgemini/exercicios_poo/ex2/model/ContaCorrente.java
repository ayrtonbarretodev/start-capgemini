package br.com.capgemini.exercicios_poo.ex2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
public class ContaCorrente {
    private String numero;
    private Titular titular;
    private BigDecimal saldo;

    public ContaCorrente(String numero, Titular titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = BigDecimal.ZERO;
    }

    public void atualizarSaldo(BigDecimal valor) {
        this.saldo = valor;
    }

}
