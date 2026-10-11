package Java_lista_10;

import java.util.Scanner;

public class at9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] vetor=new String[15];
        int vogal;
        vogal=0;

        System.out.println("Digite 15 letras e sera exibido quantas são vogais");
        for (int i=0;i<15;i++) {
            vetor[i]= sc.nextLine().toLowerCase();
            if (vetor[i].equals("a")|| vetor[i].equals("e")||vetor[i].equals("i")||vetor[i].equals("o")||vetor[i].equals("u")) {
                vogal++;
            }
        }
        System.out.println("A quantidade de vogais digitadas foi: "+ vogal);
        sc.close();

    }
}
