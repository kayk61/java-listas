package at;

import java.util.Scanner;

public class at16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("digite um numero e sara informado se ele e divisivel por 2,3 e por 5 ao mesmo tempo");
        n = sc.nextInt();

        if (n%2==0 && n%3==0 && n%5==0) {
            System.out.println("O numero e divisivel por 2,3 e por 5");
        }else {
            System.out.println("o numero nao e divisel pelos numeros citados");
        }
    }
}
