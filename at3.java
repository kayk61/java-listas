package Java_lista_3;

import java.util.Scanner;

public class at3 {
    public static void main(String[] args) {
        int temp;

        System.out.println("digite a temperatura do ambiente: ");
        Scanner sc=new Scanner(System.in);
        temp = sc.nextInt();

        if (temp>40) {
            System.out.println("Temperatura extremamente alta: "+ temp + "°C");
        }else {
            System.out.println("Temperatura dentro dos limites normais: "+ temp + "°C");
        }
    }
}
