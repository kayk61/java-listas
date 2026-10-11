package JAVA_lista_6;

import java.util.Scanner;

public class at7 {
    public static void main(String[] args) {
        //Leia 8 números e mostre a soma somente dos valores maiores que 50.
        Scanner sc=new Scanner(System.in);
        int n,cont,soma;
        soma = 0;
        cont = 0;

        System.out.println("digite 8 numeros e serao somados apenas os maiores que 50");
        do {
            n = sc.nextInt();
            cont = cont+1;
            if (n>50) {
                soma = soma+n;

            }

        }while (cont==8 == false);
        System.out.println("A soma dos numeros maiores que 50 é: "+ soma);
        sc.close();
    }
}
