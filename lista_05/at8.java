package lista_5_java;

import java.util.Scanner;

public class at8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,c,a;
        c = 0;
        n = 0;
        a = 0;

        System.out.println("digite suas notas");
        while (c<5) {
            c= c+1;
            n = sc.nextInt();
            a = a+n;
        }
        System.out.println("A media das suas notas é: "+ (a/5));
        sc.close();



    }
}
