package Java_lista_10;

import java.util.Arrays;
import java.util.Scanner;

public class at8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] vetor = new int[12];
        System.out.println("digite 12 numeros");
        for (int i=11;i>-1;i--) {
            vetor[i] = sc.nextInt();



        }
        System.out.println(Arrays.toString(vetor));

        sc.close();



    }
}
