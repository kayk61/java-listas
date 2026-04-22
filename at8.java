package JAVA_lista_6;

import java.util.Scanner;

public class at8 {
    public static void main(String[] args) {
        //Leia números até digitar 0 e mostre quantos são múltiplos de 5.
        Scanner sc=new Scanner(System.in);
        int n,cont;
        cont=-1;

        System.out.println("Digite numeros e será mostrado quantos são multiplos de 5 ate que seja digitado 0 para encerrar o programa");
        do {
            n = sc.nextInt();
            if (n%5==0) {
                cont = cont+1;
            }

        }while (n == 0 ==false);
        System.out.println("A quantidade de numeros multiplos de 5 é: "+ cont);
        sc.close();

    }
}
