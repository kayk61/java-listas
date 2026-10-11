package java_lista_4;

import java.util.Scanner;

public class at11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, h2;

        System.out.println("digite a quando começou o jogo");
        h = sc.nextInt();
        System.out.println("Digite quando terminou o jogo");
        h2 = sc.nextInt();

        if (h > h2) {
            System.out.println("o jogo terminou no dia seguinte e durou: "+ ((24-h)+h2));
        }else {
            System.out.println("O jogo terminou no mesmo dia e durou: "+ (24-h2) + " horas");
        }
        sc.close();
    }}
