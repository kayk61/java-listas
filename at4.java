package JAVA_lista_6;

import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        //Leia números até digitar um valor negativo. Calcule a média apenas dos números
        //positivos.
        Scanner sc = new Scanner(System.in);
        double n,cont,soma;
        soma = 0;
        cont = 0;

        System.out.println("digite alguns numeros para ser calculado a media ou digite um numero negativo para encerrar o programa: ");

        do {
            n= sc.nextDouble();

            if (n>0) {
                cont = cont+1;
                soma = soma+n;

            }


        }while (n<0 == false);
        System.out.println("A media dos numeros é: " + (soma/cont));
        sc.close();
    }
}
