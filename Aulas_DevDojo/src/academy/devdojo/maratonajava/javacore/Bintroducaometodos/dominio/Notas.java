package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Notas {
    private double[] notas;

    public double mediaDeTresNotas(){
        double somaNotas = 0;
        for (double nota : notas){
            somaNotas += nota;
        }
        return somaNotas / 3;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

}
