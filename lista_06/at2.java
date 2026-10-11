package JAVA_lista_6;

import java.util.Scanner;

public class at2 {
    public static void main(String[] args) {
        //2. Contagem de números maiores que 10
        //Leia números até que seja digitado 0 e mostre quantos valores são maiores que
        //10.

        Scanner sc=new Scanner(System.in);
        int n,cont,n2;
        cont = 0;

        System.out.println("Digite alguns numeros e sera mostrado quantos sao maiores que 10(ou digite 0 para encerrar o programa)");
        do {
            n = sc.nextInt();
            if (n>10) {
                cont = cont+1;
            }

        }while (n == 0 == false);
        System.out.println("A quantidade de numeros maiores que 10 digitados foi: "+ cont);
        sc.close();
    }
}
