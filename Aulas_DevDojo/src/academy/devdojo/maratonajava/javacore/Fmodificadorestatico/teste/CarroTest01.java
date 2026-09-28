package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.teste;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro c1 = new Carro("BMW", 290);
        Carro c2 = new Carro("Mercedes", 270);
        Carro c3 = new Carro("Audi", 230);

        Carro.velocidadeLimite = 180;

        c1.imprime();
        c2.imprime();

        Carro.velocidadeLimite = 150;

        c3.imprime();

    }
}
