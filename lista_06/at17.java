package JAVA_lista_6;

import java.util.Scanner;

public class at17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,soma;
        soma = 0;

        System.out.println("digite numeros e sera somados apenas os numeros pares");
        n = sc.nextInt();
        if (n%2==0) {
            soma = soma+n;
        }
        while (n == 0 == false) {
            n = sc.nextInt();
            if (n%2==0) {
                soma = soma+n;
            }

        }
        System.out.println("a soma dos numeros pares é: "+ soma);
        sc.close();
    }
}
