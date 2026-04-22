package JAVA_lista_6;

import java.util.Scanner;

public class at3 {
    public static void main(String[] args) {
        //3. Soma dos números múltiplos de 3
        //Leia números até digitar 0 e calcule a soma apenas dos números que forem
        //múltiplos de 3.
        Scanner sc=new Scanner(System.in);
        int soma,n,n2;
        soma = 0;

        System.out.println("digite alguns numeros ao final sera mostrado a soma dos numeros multiplos de 3");
        do {
            n = sc.nextInt();
            if (n%3==0) {
                soma = soma+n;
            }


        }while (n == 0 == false);
        System.out.println("A soma dos numeros multiplos de 3 é: "+ soma);
        sc.close();
    }
}
