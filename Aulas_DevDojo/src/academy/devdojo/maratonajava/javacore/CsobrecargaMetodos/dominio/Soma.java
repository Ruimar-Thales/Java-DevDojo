package academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.dominio;

public class Soma {

    public void somar(int num1, int num2){
        System.out.println("Soma dos numeros: " + (num1 + num2));
    }

    public void somar(double num1, double num2){
        System.out.println("Soma dos numeros: " + (num1 + num2));
    }

    public void somar(int num1, int num2, int num3){
        System.out.println("Soma dos numeros: " + (num1 + num2 + num3));
    }

}
