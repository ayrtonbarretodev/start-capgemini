package br.com.capgemini.exercicios_poo.ex10;

import br.com.capgemini.exercicios_poo.ex10.enums.Posicao;
import br.com.capgemini.exercicios_poo.ex10.modelo.Jogador;
import br.com.capgemini.exercicios_poo.ex10.service.JogadorService;

import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        jogador.setNome("Ayrton");
        jogador.setAltura(1.77);
        jogador.setNacionalidade("Brasileiro");
        jogador.setPeso(85.0);
        jogador.setPosicao(Posicao.ATACANTE);
        jogador.setDataNascimento(LocalDate.of(1994,5,10));

        JogadorService service = new JogadorService();
        int idadeAtual = service.calculaIdade(jogador);
        System.out.println("Idade atual: " + idadeAtual);

        System.out.println();

        int tempoAposentadoria = service.calculaAposentadoria(jogador, jogador.getPosicao());
        System.out.println(tempoAposentadoria + " anos para se aposentar");
    }
}
