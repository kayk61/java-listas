package JAVA_lista_6;

import java.util.Scanner;

public class at5 {
    public static void main(String[] args) {
        //Leia números até digitar 0. Para cada número, mostre o dobro do valor.
        Scanner sc= new Scanner(System.in);
        int n;

        System.out.println("Digite um numero e sera mostrado seu dobro(ou digite 0 para encerrar o programa)");

        do {
            n= sc.nextInt();
            System.out.println(n*2);

        }while (n == 0 == false);

        sc.close();
    }
}
