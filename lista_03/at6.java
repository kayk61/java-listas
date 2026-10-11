package Java_lista_3;

import java.util.Scanner;

public class at6 {
    public static void main(String[] args) {
        int id;

        Scanner sc=new Scanner(System.in);
        System.out.println("Digite sua idade: " );
        id = sc.nextInt();

        if (id<=12) {
            System.out.println("Idade: "+ id);
            System.out.println(" Classificação: Infantil");
        } else if (id>=13 && id<=17) {
            System.out.println("Idade: "+id);
            System.out.println(" Classificação: Adolescente");
        } else if (id>=18 && id<=64) {
            System.out.println("Idade: "+ id);
            System.out.println(" Classificação: Adulto");

        }else {
            System.out.println("Idade: "+ id);
            System.out.println(" Classificação: Idoso");
        }
    }
}
