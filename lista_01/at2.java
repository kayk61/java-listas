package at1;

import java.util.Scanner;

public class at2 {
    public static void main(String[] args) {
        int n1,n2,n3,n4,na;
        Scanner sc=new Scanner(System.in);

        System.out.println("digite a primeira nota:");
        n1 = sc.nextInt();
        System.out.println("digite a segunda nota:");
        n2 = sc.nextInt();
        System.out.println("digite a terceira nota:");
        n3 = sc.nextInt();
        System.out.println("digite a quarta nota:");
        n4 = sc.nextInt();

        na = n1+n2+n3+n4;

        System.out.println("A media das notas é: "+ (na/4));

        sc.close();
    }

}
