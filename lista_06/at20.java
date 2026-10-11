package at;

import java.util.Scanner;

public class at20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n,total,desconto;
        desconto = 0;

        System.out.println("digite o preço de seus produtos ou digite 0 para prosseguir para o pagamento");
        n = sc.nextInt();
        total = 0;
        while (n == 0 == false) {
            total = total+n;
            n = sc.nextInt();
            if (total>500) {
                desconto = (total*0.05);
            }

        }
        System.out.println("O preço total da sua compra foi: "+ total);
        System.out.println("valor final com desconto a ser pago: "+ (total-desconto));
        sc.close();
    }
}
