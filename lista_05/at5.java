package lista_5_java;

import java.util.Scanner;

public class at5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,c;
        c = 0;

        System.out.println("digite os um numero para ser mostrado todos os numeros multiplos de 5");
        n = sc.nextInt();

        while (c<=n) {
            System.out.println(c);
            c = c+5;
        }
        sc.close();
    }
}
