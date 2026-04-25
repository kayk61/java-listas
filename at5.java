package java_lista_2;

import java.util.Scanner;

public class at5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("digite um numero e sera mostrado se ele é divisivel por 2 e por 3 ao mesmo tempo");
        n= sc.nextInt();

        if (n%2==0 && n%3==0) {
            System.out.println("O numero é divisivel por ambos os numeros");
        }else {
            System.out.println("o numero nao é divisivel por 2 e 3 ao mesmo tempo");

        }
        sc.close();
    }
}
