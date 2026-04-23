package JAVA_lista_6;

import java.util.Scanner;

public class at15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s;

        System.out.println("digite sua senha");
        s = sc.nextInt();
        while (s == 1234 == false) {
            System.out.println("senha invalida tente novamente");
            s = sc.nextInt();
        }
        System.out.println("acesso liberado");
        sc.close();
    }
}
