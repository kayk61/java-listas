package java_lista_8;

import java.util.Scanner;

public class at14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,positivos;
        positivos = 0;

        System.out.println("Digite 6 numeros e sera somado apenas os positivos");
        for (int cont = 0;cont<=6;cont++) {
            n = sc.nextInt();
            if (n>0) {
                positivos = positivos+n;
            }

        }
        System.out.println("A soma dos numeros positivos digitados é: "+ positivos);
        sc.close();
    }
}
