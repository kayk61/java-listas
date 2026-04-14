package Java_lista_3;

import java.util.Scanner;

public class at2 {
    public static void main(String[] args) {
        int pro;

        System.out.println("digite o preço do seu produto");
        Scanner sc=new Scanner(System.in);
        pro = sc.nextInt();

        if (pro <100) {
            System.out.println("desconto de 10% aplicado: " + (pro-pro*0.10));
        }else {
            System.out.println("requisitos para o desconto inalcançado: "+ pro);
        }
    }
}
