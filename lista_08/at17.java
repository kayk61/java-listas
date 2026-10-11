package java_lista_8;

import java.util.Scanner;

public class at17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("Digite um numero e sera mostrado todos seus divisores");
        n = sc.nextInt();
        for (double i=0; i <= n ; i++) {
            if (n%i == 0) {
                System.out.println("Este numero é divisor: "+i);
            }

        }
        sc.close();
    }
}
