package Java_lista_3;

import java.util.Scanner;

public class at9 {
    public static void main(String[] args) {
        int temp;

        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a temperatura do ambiente");
        temp = sc.nextInt();

        if (temp<=15) {
            System.out.println("Esta frio: "+ temp + "°C");
        } else if (temp>15 && temp<=25) {

            System.out.println("Esta agradavel: "+ temp + "°C");
        }else {
            System.out.println("Esta quente: "+ temp + "°C");
        }
    }
}
