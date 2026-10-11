package Java_lista_3;

import java.util.Scanner;

public class at8 {
    public static void main(String[] args) {
        int n;

        Scanner sc=new Scanner(System.in);
        System.out.println("digite um numero e sera exibido se ele é positivo ou negativo");
        n = sc.nextInt();

        if (n>=0) {
            System.out.println("Numero positivo: "+ n);

        }else {
            System.out.println("Numero negativo: "+ n);
        }
    }
}
