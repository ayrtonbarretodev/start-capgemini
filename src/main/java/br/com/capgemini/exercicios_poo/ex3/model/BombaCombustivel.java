package br.com.capgemini.exercicios_poo.ex3.model;

import br.com.capgemini.exercicios_poo.ex2.exceptions.ValorNegativoException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class BombaCombustivel {
    private String tipoCombustivel;
    private BigDecimal valorPorLitro;
    private BigDecimal quantidadeCombustivel;

    public void alterarValorDoCombustivel(BigDecimal novoValor){
        this.valorPorLitro = novoValor;
    }

    public void alterarTipoDoCombustivel(String novoTipo){
        this.tipoCombustivel = novoTipo;
    }

    public void alterarQuantidadeDoCombustivel(BigDecimal novaQuantidade){
        this.quantidadeCombustivel = novaQuantidade;
    }

    public void abastecerPorValor(BigDecimal valor){
        saldoInsuficienteValidacao(valor);
        BigDecimal totalLitro = valor.divide(valorPorLitro);
        System.out.println("Quantidade de litros: " + totalLitro);
        diminuirQuantidadeCombustivel(totalLitro);
    }

    public void abastecerPorLitro(BigDecimal qtdLitro){
        BigDecimal valorASerPago = qtdLitro.multiply(valorPorLitro);
        System.out.println("Valor a ser pago: " + valorASerPago);
        diminuirQuantidadeCombustivel(qtdLitro);
    }

    private void diminuirQuantidadeCombustivel(BigDecimal litro){
        this.quantidadeCombustivel= this.quantidadeCombustivel.subtract(litro);
    }

    private void saldoInsuficienteValidacao(BigDecimal valor){
        if (!(valor.compareTo(BigDecimal.ZERO) > 0)) {
            throw new ValorNegativoException("O valor precisa ser maior que zero");
        }
    }


}
