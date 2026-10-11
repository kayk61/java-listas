package JAVA_lista_6;

import java.util.Scanner;

public class at14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("digite sua nota entre 0 e 10");
        n = sc.nextInt();
        while (n<0 || n>10) {
            System.out.println("digite uma nota valida");
            n = sc.nextInt();
        }
        System.out.println("nota valida nota: "+ n);
        sc.close();
    }
}
