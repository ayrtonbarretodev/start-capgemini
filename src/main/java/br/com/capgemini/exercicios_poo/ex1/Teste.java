package br.com.capgemini.exercicios_poo.ex1;

import br.com.capgemini.exercicios_poo.ex1.model.Pessoa;
import br.com.capgemini.exercicios_poo.ex1.service.PessoaService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Ayrton Barreto", LocalDate.of(1994, Month.JUNE,2),new BigDecimal("1.77"));
        PessoaService pessoaService = new PessoaService();
        pessoaService.calcularIdade(p);
    }
}
