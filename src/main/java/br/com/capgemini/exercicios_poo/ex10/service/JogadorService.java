package br.com.capgemini.exercicios_poo.ex10.service;

import br.com.capgemini.exercicios_poo.ex10.enums.Posicao;
import br.com.capgemini.exercicios_poo.ex10.modelo.Jogador;

import java.time.LocalDate;
import java.time.Period;


public class JogadorService {


    public int calculaIdade(Jogador jogador) {
        LocalDate anoAtual = LocalDate.now();
        Period period = Period.between(jogador.getDataNascimento(), anoAtual);
        int idadeAtual = period.getYears();
        return idadeAtual;
    }

    public int calculaAposentadoria(Jogador jogador, Posicao posicao) {

        if (jogador.getPosicao().equals(Posicao.DEFENSOR)) {
            return tempoAposentadoria(calculaIdade(jogador), posicao.getIdadeAposentadoria());

        } else if (jogador.getPosicao().equals(Posicao.MEIOCAMPO)) {
            return tempoAposentadoria(calculaIdade(jogador), posicao.getIdadeAposentadoria());

        } else {
            return tempoAposentadoria(calculaIdade(jogador), posicao.getIdadeAposentadoria());
        }
    }

    private int tempoAposentadoria(int idadeAtual, int idadeAposentadoria) {
        return idadeAposentadoria - idadeAtual;
    }
}
