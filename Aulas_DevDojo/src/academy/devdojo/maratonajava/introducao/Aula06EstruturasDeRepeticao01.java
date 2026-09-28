package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do... while, for

        int count = 12;

        while (count < 5) {
            System.out.println(count);
            count += 1;
        }

        count = 77;

        do {
            System.out.println("do while: " + count);
            count++;
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
