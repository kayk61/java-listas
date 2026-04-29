package java_lista_8;

import java.util.Scanner;

public class at12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,menor;

        System.out.println("digite 5 numeros e sera dito qual o maior entre eles");
        n = sc.nextInt();
        menor = n;
        for (int cont = 1;cont<=4;cont++) {
            n = sc.nextInt();
            if (n<menor) {
                menor = n;
            }

        }
        System.out.println("O menor numero digitado é: "+ menor);
        sc.close();
    }
}
