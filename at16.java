package JAVA_lista_6;

import java.util.Scanner;

public class at16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,cont;
        cont = 0;

        System.out.println("digite numeros e sera dito quantos estao entre 10 e 50");
        n = sc.nextInt();
        if (n<50 && n>10){
            cont=cont+1;
        }
        while (n == 0 ==false) {
            System.out.println("continue digitando numeros");
            n = sc.nextInt();
            if (n>10 && n<50) {
                cont=cont+1;
            }

        }
        System.out.println("a quantidade de numeros entre 10 e 50 é: "+ cont);
        sc.close();

    }
}
