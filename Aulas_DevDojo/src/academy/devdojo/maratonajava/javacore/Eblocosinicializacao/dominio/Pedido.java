package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Pedido {
    private String status;
    private String produto;

    {
        status = "pendente";
    }

    public void statusProduto(){
        System.out.println("Status: " + status);
        System.out.println("Produto: " + produto);
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
