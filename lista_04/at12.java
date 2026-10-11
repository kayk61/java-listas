package java_lista_4;

import java.util.Scanner;

public class at12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pro;

        System.out.println("Digite o preço do produto");
        pro = sc.nextInt();
        System.out.println("Digite o metodo de pagamento( sendo a: para a vista b: para cartao c: para carne)");
        char pag = sc.next().charAt(0);

        if (pag=='a') {
            System.out.println("metodo de pagamento a vista desconto de 10%: "+ (pro-pro*0.10));
        } else if (pag == 'b') {
            System.out.println("metodo de pagamento no cartao desconto de 5%: "+ (pro-pro*0.05));

        }else {
            System.out.println("metodo de pagamento no  carne produto 2x mais caro: "+ (pro*2));
        }
        sc.close();
    }
}
