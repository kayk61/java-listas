package Java_lista_10;

import java.util.Arrays;
import java.util.Scanner;

public class at10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        int[] vetor2 = new int[10];
        int soma;
        soma=0;

        for (int i = 0;i<10;i++) {
            soma += vetor[i];
            vetor2[i] = soma;
            System.out.println(Arrays.toString(vetor2));
        }
        sc.close();

    }

}
