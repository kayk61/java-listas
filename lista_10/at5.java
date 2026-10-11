package Java_lista_10;

import java.util.Scanner;

public class at5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numeros = {10,3,5,18,40,50,27,26,58,98,209};
        int ndigitado,posiçao;
        posiçao=0;


        System.out.println("digite um numero e sera dito se ele esta dentro do vetor e qual sua posição ou se ele nao esta no vetor");
        while (true) {
            ndigitado = sc.nextInt();
            if (ndigitado == 0) {
                break;
            }
            if (ndigitado == numeros[0]||ndigitado == numeros[1]||ndigitado == numeros[2]||ndigitado == numeros[3]||ndigitado == numeros[4]||ndigitado == numeros[5]||ndigitado == numeros[6]||ndigitado == numeros[7]||ndigitado == numeros[8]||ndigitado == numeros[9]){
                System.out.println("o numero esta dentro do vetor: "+ ndigitado);
            }
        }

    }
}
