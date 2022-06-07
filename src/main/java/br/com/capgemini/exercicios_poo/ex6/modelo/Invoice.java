package br.com.capgemini.exercicios_poo.ex6.modelo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Invoice {
    private String numero;
    private String descricao;
    private Integer quantidade;
    private BigDecimal preco;

    public Invoice(String numero, String descricao, Integer quantidade, BigDecimal preco) {
        this.numero = numero;
        this.descricao = descricao;
        validacaoPrecoNegativo(preco);
        validacaoQuantidadeNegativo(quantidade);
    }

    private void validacaoPrecoNegativo(BigDecimal preco) {
        if (!(preco.compareTo(BigDecimal.ZERO) > 0)) {
            this.preco = BigDecimal.ZERO;
        } else {
            this.preco = preco;
        }

    }

    private void validacaoQuantidadeNegativo(Integer quantidade) {
        if (!(quantidade.compareTo(0) > 0)) {
            this.quantidade = 0;
        }else {
            this.quantidade = quantidade;
        }

    }

    public BigDecimal getInvoiceAmount() {
        BigDecimal valorDaFatura = this.preco.multiply(BigDecimal.valueOf(quantidade));
        return valorDaFatura;
    }
}
