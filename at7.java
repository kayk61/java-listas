package at1;

import java.util.Scanner;

public class at7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("digite um numero e sera mostrado seu antecessor e seu sucessor: ");
        n = sc.nextInt();

        System.out.println("sus antecessor é: "+ (n-1)+ " e seu sucessor é: "+ (n+1));



        sc.close();
    }
}
