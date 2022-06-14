package br.com.capgemini.exercicios_poo.ex17.service;

import br.com.capgemini.exercicios_poo.ex17.enums.TipoReuniao;
import br.com.capgemini.exercicios_poo.ex17.modelo.Reuniao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceReuniao {
    private List<Reuniao> reuniaoList = new ArrayList<>();

    public void agendarReuniao(Reuniao reuniao){
        reuniaoList.add(reuniao);
    }

    public void removerReuniao(Reuniao reuniao){
        reuniaoList.remove(reuniao);
    }

    public Reuniao buscarReuniao(String titulo){
        for (Reuniao r:reuniaoList) {
            if (r.getTitulo().equals(titulo)){
                return r;
            }
        }
        return null;
    }

    public void alterarReuniao(String titulo, Scanner scanner){
        Reuniao r = buscarReuniao(titulo);
        System.out.println("Digite um novo titulo: ");
        String novoTitulo = scanner.next();
        r.setTitulo(novoTitulo);

        System.out.println();

        System.out.println("Tipos");
        System.out.println("1 - Pagamento");
        System.out.println("2 - Reunião");
        System.out.println("3 - Entrega de Projeto");

        System.out.println();
        System.out.println("Digite um novo tipo: ");
        String novoTipo = scanner.next();

        if (novoTipo.equals("1")){
            r.setTipoReuniao(TipoReuniao.PAGAMENTO);
        }

        if (novoTipo.equals("2")){
            r.setTipoReuniao(TipoReuniao.REUNIAO);

        }if (novoTipo.equals("3")){
            r.setTipoReuniao(TipoReuniao.ENTREGAPROJETO);
        }

        System.out.println("Digite um novo nome de participante: ");
        String novoParticipante = scanner.next();
        r.setNomeParticipante(novoParticipante);

        System.out.println("Digite um novo número de telefone: ");
        String novoTelefone = scanner.next();
        r.setTelefone(novoTelefone);

        System.out.println("Digite uma nova data: ");
        System.out.println("Dia");
        int dia = scanner.nextInt();
        System.out.println("Mês");
        int mes = scanner.nextInt();
        System.out.println("Ano");
        int ano = scanner.nextInt();
        r.setDate(LocalDate.of(ano,mes,dia));
    }

    public void exibirCompromissosPorParticipante(String nomeParticipante){
        reuniaoList.stream()
                .filter(reuniao -> reuniao.getNomeParticipante().equals(nomeParticipante))
                .forEach(reuniao -> System.out.println(reuniao));
    }

    public void exibirCompromissosPorData(LocalDate date){
        reuniaoList.stream()
                .filter(reuniao -> reuniao.getDate().equals(date))
                .forEach(reuniao -> System.out.println(reuniao));
    }

    public void exibirReunioes(){
        reuniaoList.stream().forEach(reuniao -> System.out.println(reuniao));
    }
}
