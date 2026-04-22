package JAVA_lista_6;

import java.util.Scanner;

public class at9 {
    public static void main(String[] args) {
        //Leia números até digitar 0 e mostre quantos valores estão entre 20 e 80.
        Scanner sc=new Scanner(System.in);
        int n,cont;
        cont = 0;

        System.out.println("digite numeros e sera dito quantos estao entre 20 e 80 ou digite 0 para encerrar o programa: ");
        do {
            n = sc.nextInt();
            if (n>=20 && n<=80) {
                cont = cont+1;
            }

        }while (n == 0 == false);
        System.out.println("A quantidade de numeros entre 20 e 80 foi: " + cont);
        sc.close();
    }
}
