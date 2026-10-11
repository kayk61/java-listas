package java_lista_8_5;

import java.util.Scanner;

public class at1 {
    public static void main(String[] args) {
        //Conjectura de Collatz: Peça ao usuário um número inteiro positivo. Faça:
        //se o número for par, divida-o por 2; se for ímpar, multiplique por 3 e some 1.
        //Acumule a quantidade de passos. Enquanto o número for diferente de 1.
        //No final, exiba quantos passos matemáticos foram necessários.
        Scanner sc=new Scanner(System.in);
        int numero,passos;
        passos = 0;
        numero = 0;

        System.out.println("Digite um numero inteiro positivo e sera exibida a conjectura de collatz do proprio");
        numero = sc.nextInt();
        while (numero == 1 == false) {
            if (numero%2==0) {
               numero = numero/2;
               passos++;
                System.out.println(numero);

            }else {
                numero = (numero*3+1);
                System.out.println(numero);
                passos++;

            }


        }
        sc.close();
        System.out.println("A quantidade de passos matematicos necessario foi: "+ passos);
    }


}
