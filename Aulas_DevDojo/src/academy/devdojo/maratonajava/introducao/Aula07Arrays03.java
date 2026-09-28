package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 2, 9, 1, 5};
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{5, 4, 3, 2, 1};
        double[] precos = {12.50, 8.00, 45.99, 3.75, 29.90, 100.00};
        String[] frutas = {"maçã", "banana", "maçã", "laranja", "maçã", "uva"};
        int count = 0;
        int sum = 0;


        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        System.out.println();

        for(int nums:numeros3){
            System.out.println(nums);
        }

        System.out.println();

        for (int num : numeros){
            sum += num;
        }
        System.out.println(sum);

        System.out.println();

        for (double values : precos){
            if (values > 20.00) {
                System.out.println(values);
            }
        }

        System.out.println();

        for (String fruta : frutas){
            if(fruta.equals("maçã")){
                count++;
            }
        }
        System.out.println(count);
    }
}
