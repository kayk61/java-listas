package java_lista_2;

import java.util.Scanner;

public class at10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int senha;

        System.out.println("digite sua senha");
        senha = sc.nextInt();

        if (senha == 1234) {
            System.out.println("acesso permitido");
        }else {
            System.out.println("acesso negado");
        }
        sc.close();
    }
}
