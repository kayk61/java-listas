package Java_lista_3;

import java.util.Scanner;

public class at12 {
    public static void main(String[] args) {
        int n,n2,n3;

        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        n= sc.nextInt();
        System.out.println("Digite o segundo numero");
        n2= sc.nextInt();
        System.out.println("Digite o terceiro numero");
        n3= sc.nextInt();


        if (n>n2 && n>n3) {
            System.out.println("O primeiro numero digitado foi o maior: "+ n);
        } else if (n2>n && n2>n3) {
            System.out.println("O segundo numero digitado foi o maior: "+ n2);
        } else if (n3>n && n3>n2) {
            System.out.println("O terceiro numero digitado foi o maior: "+ n3);
        }
        if (n<n2 && n<n3) {
            System.out.println("O primeiro numero digitado foi o menor: "+ n);
        } else if (n2<n && n2<n3) {
            System.out.println("O segundo numero digitado foi o menor: "+ n2);
        } else if (n3<n && n3<n2) {
            System.out.println("O terceiro numero digitado foi o menor: "+ n3);
        }

    }
}
