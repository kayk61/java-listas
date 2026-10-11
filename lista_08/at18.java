package java_lista_8;

import java.util.Scanner;

public class at18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,raiz,contp,cont;
        cont= 0;
        contp = 0;

        System.out.println("digite um numero e sera verificado se ele é primo");
        n = sc.nextInt();
        raiz = n;
        for (int i=2;i<=raiz;i++) {
            if (n%i==0 ) {
                cont = cont+1;

            }else {
                contp = contp+1;
            }

        }
        if (cont == 1) {
            System.out.println("0 numero é primo");
        }else {
            System.out.println("o numero nao é primo");
        }
        sc.close();
    }

}
