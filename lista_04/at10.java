package java_lista_4;

import java.util.Scanner;

public class at10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n;

        System.out.println("digite um numero par e menor que 100 ou impar e maior que 100");
        n = sc.nextInt();

        if (n%2==0 && n<100) {
            System.out.println("Numero par e menor que 100");
        }else if (n%2>0 && n>100){
            System.out.println("Numero impar e maior que 100");
        } else {
            System.out.println("numero fora dos intervalos propostos");

        }
        sc.close();
    }
}
