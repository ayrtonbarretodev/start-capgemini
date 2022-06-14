package br.com.capgemini.exercicios_poo.ex17;

import br.com.capgemini.exercicios_poo.ex17.enums.TipoReuniao;
import br.com.capgemini.exercicios_poo.ex17.modelo.Reuniao;
import br.com.capgemini.exercicios_poo.ex17.service.ServiceReuniao;

import java.time.LocalDate;
import java.util.Scanner;

public class TesteReuniao {
    public static void main(String[] args) {
        Reuniao r1 = new Reuniao("Estudar", TipoReuniao.REUNIAO,"Ayrton","88", LocalDate.of(2022,7,02));
        Reuniao r2 = new Reuniao("Negócios",TipoReuniao.PAGAMENTO,"Ana","99",LocalDate.of(2022,8,12));
        Reuniao r3 = new Reuniao("Trabalho",TipoReuniao.REUNIAO,"Ana","55",LocalDate.of(2022,9,15));

        ServiceReuniao serviceReuniao = new ServiceReuniao();
        serviceReuniao.agendarReuniao(r1);
        serviceReuniao.agendarReuniao(r2);
        serviceReuniao.agendarReuniao(r3);

        System.out.println("Pesquisando compromissos por nome: ");
        serviceReuniao.exibirCompromissosPorParticipante("Ana");

        System.out.println();

        System.out.println("Pesquisando compromissos por data: ");
        LocalDate data = LocalDate.of(2022,8,12);
        serviceReuniao.exibirCompromissosPorData(data);

        System.out.println();

        serviceReuniao.buscarReuniao("Trabalho");

        System.out.println();

        Scanner leitor = new Scanner(System.in);
        serviceReuniao.alterarReuniao(r3.getTitulo(),leitor);

        System.out.println();
        System.out.println(r3);

        serviceReuniao.removerReuniao(r2);

        System.out.println("Exibindo reuniões: ");
        serviceReuniao.exibirReunioes();

    }
}
