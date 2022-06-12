package br.com.capgemini.exercicios_poo.ex12.com_collection.modelo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Agenda {
    private List<Pessoa> pessoas = new ArrayList<>();

    public void adicionarPessoa(Pessoa p){
        this.pessoas.add(p);
    }

    public void removerPessoa(Pessoa p){
        this.pessoas.remove(p);
    }

    public void buscarPessoa(String nome){
        this.pessoas.stream()
                .filter(pessoa -> pessoa.getNome().equals(nome))
                .forEach(pessoa -> System.out.println("Usuario cadastrado"));
    }

    public void imprimirAgenda(){
        this.pessoas.forEach(pessoa -> System.out.println(pessoa));
    }

    public void imprimirPessoa(Pessoa p){
        this.pessoas.forEach(pessoa ->
        {
            if (pessoa.equals(p)) {
                System.out.println(p);
            }
        });
    }
}
