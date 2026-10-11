package JAVA_lista_9;

import java.util.Arrays;
import java.util.Scanner;

public class at5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] numeros = new int[5];

        System.out.println("digite 5 numeros");
        for (int i = 4; i<5;i--) {
            numeros[i] = sc.nextInt();
            System.out.println(Arrays.toString(numeros));
        }
        sc.close();

    }
}

