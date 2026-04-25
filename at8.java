package java_lista_2;

import java.util.Scanner;

public class at8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,n2;

        System.out.println("digite o primeiro numero e sera mostrado se ele é divisel pelo segundo ou se nao ");
        n = sc.nextInt();
        System.out.println("digite o segundo numero");
        n2 = sc.nextInt();

        if (n%n2==0) {
            System.out.println("o primeiro numero é divisel pelo segundo");
        }else {
            System.out.println(" o primeiro numero nao é divisvel pelo segundo, resto da divisão: "+ (n%n2));
        }
        sc.close();
    }
}
