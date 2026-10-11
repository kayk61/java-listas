package java_lista_8;

import java.util.Scanner;

public class at11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,maior;
        maior = 0;

        System.out.println("digite 5 numeros e sera dito qual o maior entre eles");
        for (int cont = 1;cont<=5;cont++) {
            n = sc.nextInt();
            if (n>maior) {
                maior = n;
            }

        }
        System.out.println("O maior numero digitado é: "+ maior);
        sc.close();
    }
}
