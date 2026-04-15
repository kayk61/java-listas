package java_lista_4;

import java.util.Scanner;

public class at8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double p,a,c;
        System.out.println("Digite seu peso");
        p = sc.nextDouble();
        System.out.println("Digite sua altura");
        a = sc.nextDouble();
        c = (p/(a*2));

        if (c<18.5) {
            System.out.println("Peso abaixo do normal");
        } else if (c>=18.5 && c<=24.9) {
            System.out.println("Peso normal");
        } else if (c>=25 && c<=29.9) {
            System.out.println("Excesso de peso");
            
        } else if (c>=30 && c<=34.9) {
            System.out.println("Obesidade I");
            
        } else if (c>=35 && c<=39.9) {
            System.out.println("Obesidade II");
        }else {
            System.out.println("Obesidade III");
        }
        sc.close();
    }
}
