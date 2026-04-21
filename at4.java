package at1;

import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc=new Scanner(System.in);

        System.out.println("digite o primeiro numero:");
        n1 = sc.nextInt();
        System.out.println("digite o  segundo numero:");
        n2 = sc.nextInt();
        System.out.println("a soma dos numeros é: "+ (n1+n2));

        sc.close();
    }
}
