package br.com.capgemini.exercicios_poo.ex4.modelo;

import lombok.Getter;

public class Elevador {
    private Integer andarAtual = 0;
    @Getter
    private Integer totalAndares;
    private Integer capacidade;
    private Integer qtdPessoas = 0;

    public void inicializar(Integer capacidade, Integer totalAndares){
        if (capacidade < 1 || totalAndares < 1){
            throw new RuntimeException("O valor fornecido deve ser maior que zero!");
        }
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    }

    public void entrarNoElevador(){
        if (!(qtdPessoas<capacidade)){
            throw new RuntimeException("Elevador com capacidade lotada");
        }
        qtdPessoas++;
    }

    public void sairDoElevador(){
        if (!(qtdPessoas>0)){
            throw new RuntimeException("Elevador vazio");
        }
        qtdPessoas--;
    }

    public void subir(){
        if (andarAtual==totalAndares){
            throw new RuntimeException("Impossível subir, este já é o último andar!");
        }
        andarAtual++;
    }

    public void descer(){
        if (andarAtual==0){
            throw new RuntimeException("Impossível descer, você já está no térreo!");
        }
        andarAtual--;
    }

    public void verificarQuantidadePessoasNoElevador(){
        System.out.println("A Quantidade atual de pessoas no elevador é " + qtdPessoas);
    }

    public void verificarAndarAtual(){
        System.out.println("O andar atual no qual o elevador encontra-se é: " + andarAtual);
    }
}
