package Java_lista_3;

import java.util.Scanner;

public class at5 {
    public static void main(String[] args) {
        int id;

        Scanner sc=new Scanner(System.in);
        System.out.println("Digite sua idade: " );
        id = sc.nextInt();

        if (id>=16) {
            System.out.println("Pode votar, idade: "+ id );
        } else {
            System.out.println("Não pode votar, idade: "+ id);
        }
    }
}
