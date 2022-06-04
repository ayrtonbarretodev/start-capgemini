package br.com.capgemini.exercicios_poo.ex1.service;

import br.com.capgemini.exercicios_poo.ex1.model.Pessoa;

import java.time.LocalDate;
import java.time.Period;

public class Calculadora {

    public void calcularIdade(Pessoa pessoa){
        LocalDate anoAtual = LocalDate.now();
        LocalDate dataNascimento = pessoa.getDataNascimento();
        Period period = Period.between(dataNascimento,anoAtual);
        int idadeAtual = period.getYears();
        System.out.println("Idade atual: " + idadeAtual + " Anos");
    }

}
