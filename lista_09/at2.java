package JAVA_lista_9;

import java.util.Scanner;

public class at2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num = new int[5];
        int soma = 0;

        System.out.println("digite 5 numeros e ao final sera mostrado soma");

        for (int i= 0; i<5; i++) {
            num[i] = sc.nextInt();
            soma += num[i];

        }
        System.out.println(soma);
        sc.close();


    }
}
