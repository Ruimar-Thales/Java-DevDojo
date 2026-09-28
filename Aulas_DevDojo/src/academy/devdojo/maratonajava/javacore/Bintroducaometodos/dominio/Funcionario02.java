package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario02 {
    private double salario;

    public void imprimeSalario(){
        System.out.println(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }
}
