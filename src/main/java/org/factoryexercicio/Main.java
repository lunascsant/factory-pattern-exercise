package org.factoryexercicio;

public class Main {
    public static void main(String[] args) {
        GeradorDocumento pdf = new GeradorPdf();
        GeradorDocumento word = new GeradorWord();
        System.out.println(pdf.processar());
        System.out.println(word.processar());
    }
}