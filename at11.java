package JAVA_lista_6;

import java.util.Scanner;

public class at11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n,por,ar;
        ar = 0;
        por = 0;



        System.out.println("Digite uma valor e ele ira crescer de 5% em %5 ate mil");
        n = sc.nextInt();


        do {
            n = n + (n*0.05);
            System.out.println(n);



        }while (n>1000== false);
        sc.close();
    }
}
