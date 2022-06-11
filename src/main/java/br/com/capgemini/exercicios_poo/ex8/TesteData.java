package br.com.capgemini.exercicios_poo.ex8;

import java.time.LocalDate;

public class TesteData {
    public static void main(String[] args) {
        Data data = new Data(LocalDate.of(2022, 05, 10));
        System.out.println(data.getDate());

        data.comparaDatas(LocalDate.of(2022, 05, 9));

        System.out.println(data.getDia());
        System.out.println(data.getMes());
        System.out.println(data.getAno());
        System.out.println(data.getMesExtenso());

        Data dataBissexto = new Data(LocalDate.of(2028, 05, 10));
        System.out.println(dataBissexto.isBissexto());

        try {
            Data dataClonada = (Data) data.clone();
            System.out.println(dataClonada.getDate());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
