package at1;

import java.util.Scanner;

public class at9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("digite um numero e sera exibido seu dobro e seu triplo: ");
        n = sc.nextInt();
        System.out.println("seu dobro é: "+ (n*2));
        System.out.println("seu triplo é: "+ (n*3));


        sc.close();
    }
}
