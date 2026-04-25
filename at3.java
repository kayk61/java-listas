package java_lista_2;

import java.util.Scanner;

public class at3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("digite um numero e sera mostrado se ele é multiplo de 5");
        n= sc.nextInt();

        if (n%5==0) {
            System.out.println("é multiplo de 5");

        }else {
            System.out.println("não é multiplo de 5");
        }
        sc.close();


    }
}
