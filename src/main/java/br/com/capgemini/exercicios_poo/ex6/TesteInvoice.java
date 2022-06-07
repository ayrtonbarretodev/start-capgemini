package br.com.capgemini.exercicios_poo.ex6;

import br.com.capgemini.exercicios_poo.ex6.modelo.Invoice;

import java.math.BigDecimal;

public class TesteInvoice {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("001", "Chocolate", 10, new BigDecimal(3.5));
        BigDecimal valor = invoice.getInvoiceAmount();
        System.out.println(valor);
    }
}
