package JAVA_lista_6;

import java.util.Scanner;

public class at19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cont, soma,media;
        cont = 0;
        soma = 0;


        System.out.println("digite numeros e os numeros que forem maior que 100 terao a media retirada");
        n = sc.nextInt();
        if (n >= 100) {
            cont = cont + 1;
            soma = soma + n;
        }
        while (n == 0 == false) {

            n = sc.nextInt();
            if (n >= 100) {
                cont = cont + 1;
                soma = soma + n;
            }

        }
        System.out.println("a media dos numeros maiores que 100 é: "+ (soma/cont));
        sc.close();
    }
}
