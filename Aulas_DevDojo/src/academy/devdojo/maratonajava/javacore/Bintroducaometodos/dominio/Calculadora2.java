package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora2 {
    private double num1;
    private double num2;

    public Calculadora2(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }


    public double somar(){
        return num1 + num2;
    }

    public double subtrair(){
        return num1 - num2;
    }

    public double multiplicar(){
        return num1 * num2;
    }

    public double dividir(){
        if (num2 != 0){
            return num1 / num2;
        }else {
            return 0;
        }
    }



    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
