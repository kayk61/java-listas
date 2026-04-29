package java_lista_8;

import java.util.Scanner;

public class at3 {
    public static void main(String[] args) {
        //Leia um número N e exiba os números de 0 até N.
        Scanner sc =new Scanner(System.in);
        int c;
        c=0;


        System.out.println("Digite um numero e sera exibido os numeros de 0 ate o numero digitado");
        for (int n = sc.nextInt();c<=n;c++) {
            System.out.println(c);
        }
        sc.close();
    }
}
