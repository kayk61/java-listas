package java_lista_8;

import java.util.Scanner;

public class at20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int reprovados,aprovados,n;
        reprovados = 0;
        aprovados = 0;

        System.out.println("digitem suas notas e sera exibido quantos foram aprovados e quanto foram reprovados");

        for (int cont=1;cont<=10;cont++) {
            n = sc.nextInt();
            if (n>=7) {
                aprovados = aprovados+1;
            }else {
                reprovados = reprovados+1;
            }
        }
        System.out.println("A quantidade de alunos aprovados é: "+ aprovados + " e a quantidade de alunos reprovados é: "+ reprovados);
        sc.close();
    }
}
