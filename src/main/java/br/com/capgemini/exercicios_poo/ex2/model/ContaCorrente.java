package br.com.capgemini.exercicios_poo.ex2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@ToString
public class ContaCorrente {
    private String numero;
    private String titular;
    private BigDecimal saldo;

    public ContaCorrente(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = BigDecimal.ZERO;
    }

    public void alterarNome(String novoNome) {
        this.titular = novoNome;
    }

    public void depositar(BigDecimal valor) {
        verificarSeValorENegativo(valor);
        this.saldo = this.saldo.add(valor);
    }

    public void sacar(BigDecimal valor) {
        verificarSeValorEMaiorQueSaldo(valor);
        verificarSeValorENegativo(valor);
        this.saldo = this.saldo.subtract(valor);
    }


    public void verificarSaldo() {
        System.out.println("Saldo atual: " + this.saldo);
    }

    private void verificarSeValorENegativo(BigDecimal valor) {
        if (!(valor.compareTo(BigDecimal.ZERO) > 0)) {
            throw new RuntimeException("O valor precisa ser maior que zero");
        }
    }

    private void verificarSeValorEMaiorQueSaldo(BigDecimal valor) {
        if (!(valor.compareTo(this.saldo) == -1)) {
            throw new RuntimeException("Impossível sacar um valor maior do que o seu saldo. Seu saldo atual é: " + this.saldo);
        }
    }

}
