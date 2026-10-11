package JAVA_lista_9;

import java.util.Arrays;
import java.util.Scanner;

public class at3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num =new  int[5];


        System.out.println("digite 5 numeros e sera mostrado o maior e o menor");
        for (int i=0;i<5;i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        int menor = num[0];
        int maior = num[4];
        System.out.println("O maior numero digitado foi: "+ maior + " e o menor numero digitado foi: "+ menor);
        sc.close();
    }
}
