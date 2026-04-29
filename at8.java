package java_lista_8;

import java.util.Scanner;

public class at8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("digite um numero e sera exibido sua tabuada de 0 a 10");
        n = sc.nextInt();

        for (int cont = 0; cont<=10 ; cont++ ) {
            System.out.println("--tabuada--");
            System.out.println((n*cont)+ " tabuada do "+ cont);
        }
        sc.close();
    }
}
