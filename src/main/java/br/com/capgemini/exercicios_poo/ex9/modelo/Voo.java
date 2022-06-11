package br.com.capgemini.exercicios_poo.ex9.modelo;

import br.com.capgemini.exercicios_poo.ex8.Data;
import lombok.Getter;
import lombok.ToString;


@ToString
public class Voo {
    @Getter
    private String numero;
    private Data data;
    private final int FILAS = 10;
    private final int COLUNAS = 10;
    private int[][] vagas = new int[FILAS][COLUNAS];

    public Voo(String numero, Data data) {
        this.numero = numero;
        this.data = data;
    }

    public boolean verificarDisponibilidade(int fila, int cadeira) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                if (vagas[fila - 1][cadeira - 1] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean ocupaCadeira(int fila, int cadeira) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                if (verificarDisponibilidade(fila, cadeira)) {
                    vagas[fila - 1][cadeira - 1] = 1;
                    return true;
                }
            }
        }
        return false;
    }

    public int calculaVagas() {
        int contador = 0;
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                if (vagas[i][j] == 0) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public void verificarCadeiras() {
        for (int i = 0; i < vagas.length; i++) {
            for (int j = 0; j < vagas.length; j++) {
                System.out.print("F" + (i + 1) + "C" + (j + 1) + " " + ":" + vagas[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public String retornaProximaCadeiraLivre() {
        for (int i = 0; i < vagas.length; i++) {
            for (int j = 0; j < vagas.length; j++) {
                if (vagas[i][j] == 0) {
                    return "F" + (i + 1) + "C" + (j + 1) + " " + ":" + vagas[i][j] + " ";
                }
            }
        }
        return "Sem cadeiras livres";
    }
}
