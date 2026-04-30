package java_lista_8;

import java.util.Scanner;

public class at15 {
    public static void main(String[] args) {
        //Leia 8 números e informe quantos são maiores que 50.
        Scanner sc=new Scanner(System.in);
        int n,contm;
        contm = 0;

        System.out.println("Digite 8 numeros e será exibido quantos são maiores que 50");
        for (int cont = 0;cont<=8;cont++) {
            n = sc.nextInt();
            if (n>50) {
                contm = contm+1;
            }
        }
        System.out.println("A quantidade de numeros maiores que 50 são: "+ contm);
        sc.close();

    }
}
