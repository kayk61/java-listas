package java_lista_4;

import java.util.Scanner;

public class at5 {
    public static void main(String[] args) {
        int n;

        Scanner sc=new Scanner(System.in);
        System.out.println("Digite um numero entre 100 e 200");
        n = sc.nextInt();

        if (n>=100 && n<=200) {
            System.out.println("Numero dentro do intervalo: "+ n);
        }
        if (n<100) {
            System.out.println("Numero menor que o intervalo: "+ n);
        } else if (n>200){
            System.out.println("Numero maior que o intervalo: "+ n);

        }
        sc.close();
    }
}
