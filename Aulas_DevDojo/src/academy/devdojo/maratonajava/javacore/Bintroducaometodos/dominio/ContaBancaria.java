package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ContaBancaria {
    private double saldo;

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void saldo(){
        System.out.println(saldo);
    }

    public double getSaldo(){
        return saldo;
    }

}
