package at1;

import java.util.Scanner;

public class at1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n1,n2,n3,n4,n5,na;

        System.out.println("digite o primeiro numero");
        n1 = sc.nextInt();
        System.out.println("digite o segundo numero");
        n2 = sc.nextInt();
        System.out.println("digite o terceiro numero");
        n3 = sc.nextInt();
        System.out.println("digite o quarto numero");
        n4 = sc.nextInt();
        System.out.println("digite o quinto numero");
        n5 = sc.nextInt();

        na= n1+n2+n3+n4+n5;

        System.out.println("A soma dos 4 primeiros numeros divido pelo quinto numero é: "+ (na/n5));

        sc.close();
    }
}
