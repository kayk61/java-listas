package java_lista_4;

import java.util.Scanner;

public class at3 {
    public static void main(String[] args) {
        int n,n2,n3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        n = sc.nextInt();
        System.out.println("Digite o segundo numero");
        n2 = sc.nextInt();
        System.out.println("Digite o terceiro numero");
        n3 = sc.nextInt();

        if (n+n2>n3 || n2+n3>n || n3+n>n2) {
            System.out.println("os numeros podem formar um triangulo");
        }else {
            System.out.println("Os numeros não podem formar um triangulo");
        }
        if (n==n2 && n==n3) {
            System.out.println("O triangulo é equilatero");
        } else if (n==n2 || n2==n3 || n3==n) {
            System.out.println("o tringulo é isósceles");

        }else {
            System.out.println("o triangulo é escaleno");
        }
        sc.close();
    }
}
