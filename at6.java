package at1;

import java.util.Scanner;

public class at6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("digite o numero para ser elevado ao quadrado");
        n = sc.nextInt();

        System.out.println("o numero elevado ao quadrado é: "+ (n*n));


        sc.close();
    }
}
