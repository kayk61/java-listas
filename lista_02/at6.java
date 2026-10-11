package java_lista_2;

import java.util.Scanner;

public class at6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,n2;

        System.out.println("digite o primeiro numero e ao final sera dito qual dos numeros digitados é maior");
        n = sc.nextInt();
        System.out.println("digite o segundo numero");
        n2 = sc.nextInt();

        if (n>n2) {
            System.out.println("o primeiro numero foi o maior digitado");
        }else {
            System.out.println("o segundo numero foi o maior digitado");

        }
        sc.close();

    }
}
