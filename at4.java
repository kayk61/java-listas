package JAVA_lista_9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] num ={30};

        System.out.println("digite um numero e sera dito se ele esta dentro do vetor");
        int numP = sc.nextInt();

        for (int i=0;i<num.length;i++) {
            if (num[i] == numP) {
                System.out.println("O numero esta dentro do vetor");

            }else {
                System.out.println("O numero nao esta dentro do vetor");
            }
            numP = sc.nextInt();
        }

    }
}
