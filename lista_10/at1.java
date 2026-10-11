package Java_lista_10;

import java.util.Scanner;

public class at1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] vetor = new int[10];
        int soma,num;
        soma=0;

        System.out.println("digite 10 numeros e ao final sera exibido a media aritmetica");
        for (int i = 0;i<10;i++) {
            vetor[i] = sc.nextInt();
            num = vetor[i];
            soma += num;

        }
        System.out.println("A soma de todos os valores é: "+ soma + " e a media aritmetica é: "+ (soma/10));
        sc.close();
    }
}
