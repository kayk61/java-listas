package Java_lista_3;

import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        int id;


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        id = sc.nextInt();

        if (id>=18) {
            System.out.println("Maior de idade: "+ id);
        }else {
            System.out.println("Menor de idade: "+ id);
        }

    }
}
