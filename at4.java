package JAVA_lista_9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] num ={30};

        System.out.println("digite um numero e sera dito se ele esta dentro do vetor(ou digite o para encerrar o programa)");
        int numP = sc.nextInt();

        while (true) {
            if (numP == 0) {
                System.out.println("programa encerrado");
                break;
            }


            if (num[0] == numP) {
                System.out.println("O numero esta dentro do vetor");

            } else {
                System.out.println("O numero nao esta dentro do vetor");
            }
            numP = sc.nextInt();

        }
        sc.close();
    }
}
