package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Retangulo {
    private double altura;
    private double largura;

    public void calcularArea(){
        double areaRetangulo = (altura * largura);
        System.out.println("A área do retângulo é " + areaRetangulo);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
