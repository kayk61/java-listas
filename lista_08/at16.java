package java_lista_8;

import java.util.Scanner;

public class at16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fibon,numero;
        fibon = 0;
        numero = 1;

        for (int cont =1;cont<=10;cont++) {
            System.out.println(fibon+numero);
            int soma = fibon+numero;
            fibon = numero;
            numero = soma;



        }
    }

}
