package java_lista_8;

import java.util.Scanner;

public class at7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int soma,n;
        soma = 0;

        System.out.println("digite um numero e sera exibido a soma de todos os numeros ate o numero digitado");
        n = sc.nextInt();

        for (int cont = 0;cont<=n; cont++ ) {
            soma = soma+cont;
            System.out.println(soma);
        }
        sc.close();
    }
}
