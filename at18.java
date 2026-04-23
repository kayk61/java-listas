package JAVA_lista_6;

import java.util.Scanner;

public class at18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,cont,contmaior,contmenor;
        contmaior = 0;
        contmenor = -1;

        System.out.println("digite numeros e sera contado quantos são maiores que 50 e menores que 20");
        n = sc.nextInt();

        if (n>50) {
            contmaior = contmaior+1;
        } else if (n<20) {
            contmenor=contmenor+1;

        }
        while (n==0==false) {
            n = sc.nextInt();

            if (n>50) {
                contmaior = contmaior+1;
                } else if (n<20) {
                contmenor=contmenor+1;
            }
        }
        System.out.println("a quantidade de numeros maiores que 50 é: "+ contmaior + " a quantidade de numeros menores que 20 é: "+ contmenor);
        sc.close();
    }


}
