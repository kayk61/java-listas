package Java_lista_10;

import java.util.Arrays;
import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] nomes = new String[10];

        System.out.println("digite 10 nomes de alunos");
        for (int i = 9; i>-1; i--) {
            nomes[i] = sc.nextLine();
            System.out.println(Arrays.toString(nomes));
        }
        sc.close();
    }
}
