package br.com.capgemini.exercicios_poo.ex16.modelo;


public class Carro {
    private final Double TANQUE_COMBUSTIVEL = 50.0;
    private Double qntLitros;
    private Double kmPercorrido = 0.0;

    public void abastecerCarro(Double quantidade) {
        if (quantidade > TANQUE_COMBUSTIVEL) {
            throw new RuntimeException("O tanque suporta somente 50 litros de gasolina");
        } else {
            this.qntLitros = quantidade;
        }
    }

    public void moverCarro(Double km) {
        Double kmParaLitro = km / 15;

        if (qntLitros >= kmParaLitro) {
            this.qntLitros -= (km / 15);
            this.kmPercorrido += km;
        } else {
            System.out.println("Carro sem combustível suficiente");
        }
    }

    public Double quantidadeCombustivel() {
        return this.qntLitros;
    }

    public Double distanciaPercorrida() {
        return this.kmPercorrido;
    }
}
