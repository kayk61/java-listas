
package at;

import java.util.Scanner;

public class at15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia do nascimento (ex: 21): ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês do nascimento (ex: 3 para março, 4 para abril): ");
        int mes = scanner.nextInt();

        // Signo de Áries: 21/03 a 19/04
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            System.out.println("A pessoa é do signo de Áries!");
        } else {
            System.out.println("A pessoa NÃO é do signo de Áries.");
        }
        scanner.close();
    }
}