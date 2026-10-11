package lista_5_java;

import java.util.Scanner;

public class at7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, c ,a,b;
        c = 0;
        a = 1;
        b = 0;

        System.out.println("Digite um numero ");
        n = sc.nextInt();

        while (c<n) {
            c = c+1;
            a = a+1;
            b = b+a;

            System.out.println(b);
        }
        sc.close();


    }
}
