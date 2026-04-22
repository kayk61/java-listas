package JAVA_lista_6;

import java.util.Scanner;

public class at6 {
    public static void main(String[] args) {
        //Leia números até digitar 0 e mostre:
        //• O maior valor digitado
        //• O menor valor digitado
        Scanner sc=new Scanner(System.in);
        int n,maior,menor;
        maior = 0;
        menor = 0;

        System.out.println("digite numeros e ao final sera mostrado o menor e o maior digitado");

        do {
            n = sc.nextInt();
            if (n>maior) {
                maior = n;
            } else if (n>0) {
                menor = n;

            }


        }while (n == 0 == false);
        System.out.println("o maior numero é: "+ maior + " o menor numero é: "+ menor);
        sc.close();
    }

}
