package java_lista_8;

import java.util.Scanner;

public class at10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,soma;
        soma = 0;

        System.out.println("digite suas notas e ao final será exibido sua media");
        for (int cont=0; cont<5; cont++) {
            n = sc.nextInt();
            soma = soma+n;


        }
        System.out.println("A media de suas notas é: "+soma/5);
        sc.close();
    }
}
