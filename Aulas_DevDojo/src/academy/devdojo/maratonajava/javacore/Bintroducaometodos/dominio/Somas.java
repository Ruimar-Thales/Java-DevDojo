package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Somas {
    private int nums;
    private int soma;

    public Somas(int... nums){
        soma = 0;
        for (int num : nums){
            soma += num;
        }
    }

    public void imprimeSoma(){
        System.out.println("A soma dos numero é " + soma);
    }

    public void setNums(int nums){
        this.nums = nums;
    }

    public int getNums(){
        return nums;
    }

    public int getSoma() {
        return soma;
    }
}
