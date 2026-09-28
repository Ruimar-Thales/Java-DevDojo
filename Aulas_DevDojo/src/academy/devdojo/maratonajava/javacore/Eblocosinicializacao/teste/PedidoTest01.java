package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.teste;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Pedido;

public class PedidoTest01 {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido();

        pedido1.setProduto("Shampoo");

        pedido1.statusProduto();

    }
}
