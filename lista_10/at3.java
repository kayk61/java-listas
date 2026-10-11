package Java_lista_10;

import java.util.Arrays;
import java.util.Random;

public class at3 {
    public static void main(String[] args) {
        int[] vetor =new int[20];
        int [] vetor2 =new int [20];
        Random gerador;
        gerador = new Random();

        for (int i=0;i<20;i++) {
            vetor[i] = gerador.nextInt(20) + 1;
            if (vetor[i]%2==0 ){
                vetor2[i] = vetor[i];
                System.out.println(vetor2[i]);


            }

        }



    }
}
