package Java_lista_3;

import java.util.Scanner;

public class at14 {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota");
        n = sc.nextInt();

        if (n>=7) {
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
    }
}
