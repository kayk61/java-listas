package Java_lista_3;

import java.util.Scanner;

public class at10 {
    public static void main(String[] args) {
        int n,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dite o primeiro numero");
        n = sc.nextInt();
        System.out.println("Dite o segundo numero");
        n2 = sc.nextInt();

        if (n==n2) {
            System.out.println("Os os numeros são iguais");
        }
    }
}
