package academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.test;

import academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.dominio.Impressora;

public class ImpressoraTest01 {
    public static void main(String[] args) {

        Impressora impressora = new Impressora();

        impressora.imprimir();
        System.out.println("-------------------");
        impressora.imprimir("Teste de print uma vez");
        System.out.println("-------------------");
        impressora.imprimir("Teste de multiplas cópias", 3);
    }
}
