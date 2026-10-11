package Java_lista_3;

import java.util.Scanner;

public class at1 {
    public static void main(String[] args) {
        int sal;

        System.out.println("Digite seu salario: ");
        Scanner sc=new Scanner(System.in);
        sal = sc.nextInt();

        if (sal>2000) {
            System.out.println("salario alto");
        }else {
            System.out.println("salario baixo");
        }

    }

}
