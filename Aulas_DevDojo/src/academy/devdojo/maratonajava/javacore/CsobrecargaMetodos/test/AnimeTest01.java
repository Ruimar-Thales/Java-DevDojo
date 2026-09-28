package academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.test;

import academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime();
        Anime anime02 = new Anime();

        anime01.init("Konosuba", "Tv", 12);
        anime01.imprime();

        System.out.println("----------------------");

        anime02.init("Jojo", "Tv", 1, "Aventura");
        anime02.imprime();

    }
}
