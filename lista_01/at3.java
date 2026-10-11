package at1;

import java.util.Scanner;

public class at3 {
    public static void main(String[] args) {
        String nome;
        int n1,n2,na;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = sc.nextLine();
        System.out.println("digite o primeiro numero");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        n2 = sc.nextInt();


        System.out.println("seu nome é: "+ nome + " a divisao dos dois numeros é: "+ (n1/n2));

        sc.close();
    }
}
