package Java_lista_10;

import java.util.Arrays;
import java.util.Scanner;

public class at7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] gabarito = {"A","B","C","D","A","E","C","D","E","B"};
        String[] resp = new String[10];
        int acertos;
        acertos = 0;

        System.out.println("Digite suas respostas e sera exibido a quantidade de acertos");
        for (int i=0;i<10;i++) {
            resp[i] = sc.nextLine().toUpperCase();
            if (resp[i].equals(gabarito[i])){
                acertos++;
                System.out.println("Você acerotou "+ acertos + " Questões");
            }


        }
        sc.close();

    }
}
