package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Arroz", 4.50);
        Produto produto2 = new Produto("Coca Cola", 7);

        produto1.imprime();
        produto2.imprime();

        produto1.setPreco(5);
        produto1.setNome("Arroz integral");

        produto1.imprime();
        produto2.imprime();


    }
}
