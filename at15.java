package Java_lista_3;

import java.util.Scanner;

public class at15 {
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
    }
}
