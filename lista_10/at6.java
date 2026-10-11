package at9;

import java.util.Arrays;
import java.util.Scanner;

public class at6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        int[] vetor2 = new int[10];
        int n;

        System.out.println("digite um numero inteiro");

        for (int i=0;i<10;i++){
            n = sc.nextInt();
            vetor2[i] = vetor[i]*n;
            System.out.println(Arrays.toString(vetor2));


        }
        sc.close();

    }
}
