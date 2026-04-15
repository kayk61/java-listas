package java_lista_4;

import java.util.Scanner;

public class at14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int sal;

        System.out.println("Digite seu salario");
        sal = sc.nextInt();

        if (sal<=2000) {
            System.out.println("Salario isento de imposto");
        } else if (sal>2000 && sal<=5000) {
            System.out.println("salario alto imposto de 10% aplicado: "+ (sal-sal*0.10));

        }else {
            System.out.println("salario muito alto imposto de 20% aplicado: "+ (sal-sal*0.20));

        }
        sc.close();
    }
}
