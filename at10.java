package JAVA_lista_6;

import java.util.Scanner;

public class at10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,par,impar,cont;
        cont = 0;
        par = 0;
        impar = 0;

        System.out.println("digite numeros e serão somados separadamente apenas os pares e apenas os impares");
        do {
            n = sc.nextInt();
            if (n%2==0) {
                par = par+n;
            }else {
                impar = impar+n;
            }

        }while (n == 0 == false);
        System.out.println("A soma dos numeros pares é: "+ par);
        System.out.println("A soma dos numeros impares é: "+ impar);
        sc.close();
    }
}
