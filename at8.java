package at1;

import java.util.Scanner;

public class at8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2;

        System.out.println("digite o primeiro numero: ");
        n1 = sc.nextInt();
        System.out.println("digite o segundo numero: ");
        n2 = sc.nextInt();

        System.out.println("o resto da divisao é: "+ (n1%n2));

        sc.close();
    }
}
