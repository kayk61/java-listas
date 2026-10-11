package Java_lista_3;

import java.util.Scanner;

public class at11 {
    public static void main(String[] args) {
        int n;

        Scanner sc= new Scanner(System.in);
        System.out.println("Digite um numero para ser verificado se ele é divisivel por 5");
        n = sc.nextInt();

        if (n%5==0) {
            System.out.println("O numero é divisivel por 5");
        }else {
            System.out.println("O numero não e divisivel por 5");
        }
    }
}
