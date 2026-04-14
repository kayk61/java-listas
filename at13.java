package Java_lista_3;

import java.util.Scanner;

public class at13 {
    public static void main(String[] args) {
        int ano;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano para ser verificado se ele é bissexto");
        ano = sc.nextInt();

        if (ano%4==0 && ano%100>0) {
            System.out.println("O ano é bissexto");
        }else {
            System.out.println("O ano não é bissexto");
        }
    }
}
