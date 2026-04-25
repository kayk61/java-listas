package java_lista_2;

import java.util.Scanner;

public class at1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("digite um numero e sera mostrado se ele é par ou impar");
        n = sc.nextInt();
        if (n%2==0) {
            System.out.println("É par");

        }else {
            System.out.println("É impar");
        }
        sc.close();
    }
}
