package academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.dominio;

public class Impressora {
    private String texto;
    private int quantidade;

    public void imprimir(){
        System.out.println("Documento padrão");
    }

    public void imprimir(String texto){
        this.texto = texto;
        System.out.println(texto);
    }

    public void imprimir(String texto, int quantidade){
        this.texto = texto;
        this.quantidade = quantidade;

        for (int i = 0; i < quantidade; i++) {
            System.out.println(texto);
        }
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
