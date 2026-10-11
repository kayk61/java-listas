package JAVA_lista_6;

import java.util.Scanner;

public class at1 {
    public static void main(String[] args) {
        //1. Soma de números até limite informado
        //Leia um número inteiro limite. Depois leia números enquanto a soma não
        //ultrapassar esse limite. Ao final, mostre a soma total.//
        Scanner sc=new Scanner(System.in);
        int n,n2,soma;
        soma = 0;


        System.out.println("digite um numero limite: ");
        n = sc.nextInt();
        System.out.println("digite numeros para serem somados ate o limite");
        do {
            n2 = sc.nextInt();
            soma = soma + n2;


        }while (soma<=n);
        System.out.println("você ultrapassou o numero limite: " + soma);
         sc.close();
    }
}
