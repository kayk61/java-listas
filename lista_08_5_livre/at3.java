package java_lista_8_5;

import java.util.Scanner;

import java.util.Arrays;

public class at3 {
    public static void main(String[] args) {
        //Média de Notas com Pesos Dinâmicos: Faça: leia 3 notas de um aluno.
        //Calcule a média ponderada onde a maior nota tem peso 5, a nota do meio
        //peso 3 e a menor peso 2. Se a média for >= 7 E nenhuma nota for < 4, exiba
        //"Aprovado Especial". Caso contrário, "Não se qualificou". Repita Enquanto o
        //usuário não digitar um valor negativo para a primeira nota.
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a primeira nota (ou negativo para sair): ");
            double n1 = sc.nextDouble();

            if (n1 < 0) {
                System.out.println("Programa encerrado.");
                break;
            }

            System.out.print("Digite a segunda nota: ");
            double n2 = sc.nextDouble();
            System.out.print("Digite a terceira nota: ");
            double n3 = sc.nextDouble();

            double[] notas = {n1, n2, n3};
            Arrays.sort(notas);

            double menor = notas[0];
            double meio = notas[1];
            double maior = notas[2];

            double media = (maior * 5 + meio * 3 + menor * 2) / 10;

            System.out.printf("Média Ponderada: %.2f\n", media);

            if (media >= 7 && menor >= 4) {
                System.out.println("Resultado: APROVADO ESPECIAL");
            } else {
                System.out.println("Resultado: NÃO SE QUALIFICOU");
            }
        }
        sc.close();
    }
}