package at1;

import java.util.Scanner;

public class at10 {
    //10 - Média Ponderada Simples: Leia duas notas e calcule a média, sabendo que a primeira tem peso 2 e a segunda peso 3.

    /// / A fórmula da média ponderada é: ((N1 * P1) + (N2 * P2)) / (P1 + P2)
    //   media <- ((nota1 * 2) + (nota2 * 3)) / 5//

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n1,n2,na;

        System.out.println("digite a primeir anota");
        n1 = sc.nextInt();
        System.out.println("digite a segunda nota");
        n2 = sc.nextInt();

        na = n1*2 + n2*3;

        System.out.println("a media ponderada é: "+ (na/ 5));
    }
}
