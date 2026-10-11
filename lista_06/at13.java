package JAVA_lista_6;

import java.util.Scanner;

public class at13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n,media,sm,cont;
        cont = -1;
        sm = 0;

        System.out.println("digite numeros e ao final sera mostrado a media a soma total e a quantidade de numeros digitados");

        do {
            n= sc.nextInt();
            cont = cont+1;
            sm = n+sm;
            media = sm/cont;




        }while (n == 0 == false);
        System.out.println("A soma total é: "+ sm + " A media é: "+ (sm/cont) + " e a quantidade de numeros digitados é: "+ cont);
        sc.close();
    }
}
