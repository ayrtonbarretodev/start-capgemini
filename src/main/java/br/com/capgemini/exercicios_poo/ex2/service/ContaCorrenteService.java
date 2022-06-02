package br.com.capgemini.exercicios_poo.ex2.service;

import br.com.capgemini.exercicios_poo.ex2.model.ContaCorrente;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
public class ContaCorrenteService {

    private ContaCorrente contaCorrente;
    private List<IValidacaoContaCorrente> validacaoContaCorrentes;

    public void depositar(BigDecimal valor) {
        ValidacaoValorNegativo vvn = new ValidacaoValorNegativo();
        vvn.validar(contaCorrente, valor);
        BigDecimal novoSaldo = contaCorrente.getSaldo().add(valor);
        contaCorrente.atualizarSaldo(novoSaldo);
    }

    public void sacar(BigDecimal valor) {
        this.validacaoContaCorrentes.forEach(iValidacaoContaCorrente -> iValidacaoContaCorrente.validar(contaCorrente, valor));
        BigDecimal novoSaldo = contaCorrente.getSaldo().subtract(valor);
        contaCorrente.atualizarSaldo(novoSaldo);
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: " + contaCorrente.getSaldo());
    }

    public void alterarNome(String novoNome) {
        contaCorrente.getTitular().alterarNome(novoNome);
    }

    public void mostrarTitular() {
        System.out.println("Titular da conta: " + contaCorrente.getTitular().getNome());
    }
}
