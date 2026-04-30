package java_lista_8;

import java.util.Scanner;

public class at13 {
    public static void main(String[] args) {
        //Leia 10 números e conte quantos são pares.
        Scanner sc=new Scanner(System.in);
        int n,contp;
        contp = 0;

        System.out.println("digite 10 numeros e sera dito quantos são pares");
        for (int cont = 0;cont<=10;cont++) {
            n = sc.nextInt();
            if (n%2==0) {
                contp = contp+1;
            }
        }
        System.out.println("A quantidade de numeros pares é: "+ contp);
        sc.close();
    }
}
