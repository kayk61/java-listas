package java_lista_4;

import java.util.Scanner;

public class at13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("digite um numero de 4 digitos");
        n = sc.nextInt();

        if (n<1000 || n>9999) {
            System.out.println("digite um numero valido");
        }else {
            int pri = n/100;
            int ul = n%100;
            int so = pri+ul;
            int re = so*2;
            if (re == n) {
                System.out.println("o numero é magico"+ n + " é magico");

            }else {
                System.out.println("o numero não é magico");
            }
            sc.close();
        }
    }
}
