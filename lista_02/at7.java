package java_lista_2;

import java.util.Scanner;

public class at7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("Digite um numero e sera dito se o numero é negativo,positivo ou zero");
        n = sc.nextInt();

        if (n== 0) {
            System.out.println("o numero digitado foi 0");
        } else if (n<0) {
            System.out.println("o numero digitado é negativo");

        }else {
            System.out.println("o numero digitado é positivo");
        }
        sc.close();
    }
}
