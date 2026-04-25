package java_lista_2;

import java.util.Scanner;

public class at2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n,media,n2;

        System.out.println("digite sua nota primeira nota e irá ser mostrado se você foi aprovado ou reprovado");
        n = sc.nextInt();
        System.out.println("digite sua nota segunda nota e irá ser mostrado se você foi aprovado ou reprovado");
        n2 = sc.nextInt();

        media = (n+n2)/2;

        if (media>=7) {
            System.out.println("Aprovado: " + media);

        }else {
            System.out.println("reprovado: "+ media);
        }
        sc.close();
    }
}
