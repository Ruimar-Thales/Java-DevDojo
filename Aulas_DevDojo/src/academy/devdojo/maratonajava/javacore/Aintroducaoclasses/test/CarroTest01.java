package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Ford Mustang GT";
        carro1.modelo = "Coupé";
        carro1.ano = 1988;

        carro2.nome = "Fiat Mobi Trekking";
        carro2.modelo = "Hatch";
        carro2.ano = 2026;

        carro1 = carro2;

        System.out.println("| Nome: " + carro1.nome + " | Modelo: " + carro1.modelo + " | Ano: " + carro1.ano + " |");
        System.out.println("| Nome: " + carro2.nome + " | Modelo: " + carro2.modelo + " | Ano: " + carro2.ano + " |");

    }
}
