package br.com.capgemini.exercicios_poo.ex2;

import br.com.capgemini.exercicios_poo.ex2.model.ContaCorrente;
import br.com.capgemini.exercicios_poo.ex2.model.Titular;
import br.com.capgemini.exercicios_poo.ex2.service.ContaCorrenteService;
import br.com.capgemini.exercicios_poo.ex2.service.IValidacaoContaCorrente;
import br.com.capgemini.exercicios_poo.ex2.service.ValidacaoSaldoInsuficiente;
import br.com.capgemini.exercicios_poo.ex2.service.ValidacaoValorNegativo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TesteContaCorrente {
    public static void main(String[] args) {
        Titular titular = new Titular("Alana Larissa");
        ContaCorrente contaCorrente = new ContaCorrente("202293923", titular);

        ValidacaoValorNegativo validacaoValorNegativo = new ValidacaoValorNegativo();
        ValidacaoSaldoInsuficiente validacaoSaldoInsuficiente = new ValidacaoSaldoInsuficiente();

        List<IValidacaoContaCorrente> validacaoContaCorrentes = new ArrayList<>();
        validacaoContaCorrentes.add(validacaoSaldoInsuficiente);
        validacaoContaCorrentes.add(validacaoValorNegativo);

        ContaCorrenteService contaCorrenteService = new ContaCorrenteService(contaCorrente, validacaoContaCorrentes);

        contaCorrenteService.verificarSaldo();

        contaCorrenteService.depositar(new BigDecimal(200));
        contaCorrenteService.verificarSaldo();

        contaCorrenteService.sacar(new BigDecimal(100));
        contaCorrenteService.verificarSaldo();

//        contaCorrenteService.sacar(new BigDecimal(-100));
//        contaCorrenteService.sacar(new BigDecimal(300));
//        contaCorrenteService.depositar(new BigDecimal(-200));

        contaCorrenteService.alterarNome("Amanda Mayara");
        contaCorrenteService.mostrarTitular();

    }
}
