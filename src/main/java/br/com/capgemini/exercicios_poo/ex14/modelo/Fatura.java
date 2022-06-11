package br.com.capgemini.exercicios_poo.ex14.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private Double precoUnitario;

    public Double getTotalFatura() {
        Double totalFatura = precoUnitario * quantidade;
        if (!(totalFatura > 0)) {
            totalFatura = 0.0;
        }
        return totalFatura;
    }
}
