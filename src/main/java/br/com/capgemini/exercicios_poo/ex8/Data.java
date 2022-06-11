package br.com.capgemini.exercicios_poo.ex8;

import lombok.Getter;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.time.format.TextStyle;
import java.util.Locale;

@Getter
public class Data implements Cloneable {
    LocalDate date;

    public Data(LocalDate date) {
//        if (isDateValid(getDate().toString())){
//            this.date = date;
//        }else{
//            this.date = LocalDate.of(0001,01,01);
//        }

        this.date = date;
    }

//    public boolean isDateValid(String strDate) {
//        String dateFormat = "dd/MM/uuuu"; //Java 8 usa uuuupara ano
//
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
//                .ofPattern(dateFormat)
//                .withResolverStyle(ResolverStyle.STRICT);
//        try {
//            LocalDate date = LocalDate.parse(strDate, dateTimeFormatter);
//            return true;
//        } catch (DateTimeException e) {
//            return false;
//        }
//    }

    public void comparaDatas(LocalDate data) {
        if (data.compareTo(date) == -1) {
            System.out.println("Data anterior a fornecida");
        } else if (data.compareTo(date) == 0) {
            System.out.println("Datas iguais");
        } else {
            System.out.println("Data maior o que a fornecida ");
        }
    }

    public int getDia() {
        return date.getDayOfMonth();
    }

    public int getMes() {
        return date.getMonth().getValue();
    }

    public int getAno() {
        return date.getYear();
    }

    public String getMesExtenso() {
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US) + " De " + date.getMonth().getDisplayName(TextStyle.FULL, Locale.US) + " De " + getAno();
    }

    public boolean isBissexto() {
        if (date.lengthOfYear() == 366) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
