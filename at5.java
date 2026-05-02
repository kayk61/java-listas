package java_lista_8_5;

import java.util.Scanner;

public class at5 {
    public static void main(String[] args) {
        //5. Simulador de Crescimento Populacional Variável: A cidade A tem 50.000
       // habitantes e a cidade B tem 150.000. Faça: leia uma taxa de crescimento
       // anual (em porcentagem) para a cidade A. Calcule a nova população de A
       // multiplicando por essa taxa, e a de B com uma taxa fixa de 1.5%. Se a
        //diferença populacional entre elas for < 10000 OU os anos passados forem
       // múltiplos de 5, exiba "Atenção: Cidades se aproximando em tamanho!".
        // Enquanto a população de A for menor que a de B.
        Scanner sc = new Scanner(System.in);
        double a,b,taxaA,taxaB,contA,diferença;
        a = 50000;
        b = 150000;
        taxaB = b*1.05;
        contA = 0;
        while (a < b) {
            System.out.println("digite a taxa de crescimento polulacional desse ano em porcentagem");
            taxaA = sc.nextDouble();
            taxaA = taxaA*a/100;
            a = a+taxaA;
            contA++;
            b = b+taxaB;
            diferença = b-a;
            System.out.println("Populaçao da cidade A: "+a);
            System.out.println("populaçao da cidade B: "+ b);
            if (diferença<10000 || contA%5==0) {
                System.out.println("Atenção: Cidades se aproximando em tamanho!");
            }
        }

    }
}
