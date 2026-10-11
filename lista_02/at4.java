package java_lista_2;

import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ano;

        System.out.println("digite o  ano de seu nascimento");
        ano = sc.nextInt();

        if (2026-ano>=18) {
            System.out.println("maior de idade ");
        }else {
            System.out.println("menor de idade ");
        }
        sc.close();
    }
}
