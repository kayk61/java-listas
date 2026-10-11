package Java_lista_10;

import java.util.Arrays;
import java.util.Scanner;

public class at2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] vetor = new int[15];

        System.out.println("digite 15 valores e sera mostrado qual o maior qual o menor e sua posição ");
        for (int i=0;i<15;i++) {
            vetor[i] = sc.nextInt();

        }
        Arrays.sort(vetor);
        System.out.println("o maior numero é: "+ vetor[14] + " e sua posição é 0");
        System.out.println("o menor numero é: "+ vetor[0] + " e sua posição é 15");
        sc.close();

    }
}
