package java_lista_8;

import java.util.Scanner;

public class at9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        long fat = 1;

        System.out.println("digite um numero e será exibido seu fatorial");
        n = sc.nextInt();

        for (int cont = 1; cont <= n; cont++ ) {
            fat *= cont;
            System.out.println(fat);
        }
        sc.close();
    }
}
