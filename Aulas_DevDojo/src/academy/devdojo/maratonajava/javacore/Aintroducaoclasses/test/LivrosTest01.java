package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Livro;

public class LivrosTest01 {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 400);
        Livro livro2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 128);
        Livro livro3 = new Livro("Sapiens", "Yuval Noah Harari", 536);

        livro1.imprime();
        livro2.imprime();
        livro3.imprime();
    }
}
