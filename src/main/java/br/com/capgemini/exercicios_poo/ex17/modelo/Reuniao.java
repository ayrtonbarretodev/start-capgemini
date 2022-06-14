package br.com.capgemini.exercicios_poo.ex17.modelo;

import br.com.capgemini.exercicios_poo.ex17.enums.TipoReuniao;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Reuniao {
    private String titulo;
    private TipoReuniao tipoReuniao;
    private String nomeParticipante;
    private String telefone;

    private LocalDate date;

    public Reuniao(String titulo, TipoReuniao tipoReuniao, String nomeParticipante, String telefone, LocalDate date) {
        this.titulo = titulo;
        this.tipoReuniao = tipoReuniao;
        this.nomeParticipante = nomeParticipante;
        this.telefone = telefone;
        this.date = date;
    }
}
