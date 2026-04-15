package java_lista_4;

import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        int id;

        Scanner sc=new Scanner(System.in);
        System.out.println("Digite sua idade: " );
        id = sc.nextInt();

        if (id>4 && id<=7) {
            System.out.println("Idade: "+ id);
            System.out.println(" Classificação: Infantil");
        } else if (id>=8 && id<=17) {
            System.out.println("Idade: "+id);
            System.out.println(" Classificação: juvenil");
        } else if (id>18) {
            System.out.println("Idade: "+ id);
            System.out.println(" Classificação: Senior");

        }
        sc.close();

    }
}
