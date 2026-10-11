package java_lista_2;

import java.util.Scanner;

public class at9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n;

        System.out.println("digite o valor da sua compra");
        n = sc.nextInt();

        if (n>100) {
            System.out.println("valor do desconto atingido desconto de 10%: "+ (n-n*0.10));
        }else {
            System.out.println("o valor minimo de desconto nao foi atingido, valor total a ser pago: "+ n);
        }
        sc.close();
    }
}
