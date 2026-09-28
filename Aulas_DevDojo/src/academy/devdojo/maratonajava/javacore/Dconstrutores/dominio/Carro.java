package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Carro {
    private String modelo = "não informado";
    private int ano = 2026;

    public Carro(){
    }

    public Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

}
