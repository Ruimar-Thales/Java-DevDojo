package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro02 {
    public static int totalCarros;

    {
        totalCarros++;
    }

    public void imprimeQuantidade(){
        System.out.println(totalCarros);
    }

    public static int getTotalCarros(){
        return totalCarros;
    }

}
