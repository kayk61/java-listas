package java_lista_4;

import java.util.Scanner;

public class at6 {
    public static void main(String[] args) {
        double n, n2;



        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        n = sc.nextDouble();
        System.out.println("Digite o segundo numero");
        n2 = sc.nextDouble();
        System.out.println("Digite o sinal da conta(adição = +, subtração = -, multiplicação = *, e divisão = /");
        char s = sc.next().charAt(0);

        if (s=='+') {
            System.out.println("adição selecionada: "+(n+n2));
        } else if (s=='*') {
            System.out.println("multiplicação selecionada: "+(n*n2));
        } else if (s=='/') {
            System.out.println("divisão selecionada: "+ (n/n2));

        }else {
            System.out.println("subtração selecionada: "+(n-n2));
        }
        sc.close();
    }
    }

