package at1;

import java.util.Scanner;

public class at5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2;

        System.out.println("digite o primeiro numero");
        n1 = sc.nextInt();
        System.out.println("digite o segundo numero");
        n2 = sc.nextInt();

        System.out.println("a subtração do primeiro pelo segundo é: "+ (n1-n2));

        sc.close();
    }
}
