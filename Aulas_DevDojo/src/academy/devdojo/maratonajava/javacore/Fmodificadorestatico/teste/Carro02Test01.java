package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.teste;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro02;

public class Carro02Test01 {
    public static void main(String[] args) {

        Carro02 c1 = new Carro02();
        Carro02 c2 = new Carro02();
        Carro02 c3 = new Carro02();
        Carro02 c4 = new Carro02();

        System.out.println(Carro02.getTotalCarros());

    }
}
