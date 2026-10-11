package java_lista_4;

import java.util.Scanner;

public class at7 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite um numero multiplo de 7 ou de 11");
        n = sc.nextInt();

        if (n%7==0) {
            System.out.println("O numero é multiplo de 7");
        } else if (n%11==0) {
            System.out.println("O numero é multiplo de 11");
        }else {
            System.out.println("O numero não é multiplo de ambos os numeros");
        }
        sc.close();
    }
}
