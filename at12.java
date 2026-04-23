package JAVA_lista_6;

import java.util.Scanner;

public class at12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n,divisao;

        System.out.println("digite um numero e ele sera dividido ate ser menor que 1");
        n = sc.nextInt();

        do {
            n = n/2;
            System.out.println(n);

        }while (n<1 == false);
         sc.close();
    }
}
