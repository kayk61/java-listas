package java_lista_8_5;

import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        //4. Calculadora de Faturas de Água: Faça: leia o consumo mensal em
        //$m^3$. Se o consumo for <= 15, o valor é fixo em R$ 35,00. Se for > 15 E <=
        //30, cobre R$ 35,00 mais R$ 4,50 por cada metro que exceder 15. Se for >
        //30, a taxa extra passa a ser R$ 7,00 por metro excedente. Exiba o valor da
        //conta. Enquanto o consumo digitado for diferente de 0.
        Scanner sc=new Scanner(System.in);

        while (true) {
            double consumo,metro3;
            System.out.println("digite o consumo mensal de água em metros cubicos(1 metro cubico = 1000 litros de água) ou digite 0 para encerrar o programa");

            consumo = sc.nextDouble();
            if (consumo == 0){
                System.out.println("programa encerrado");
                break;

            }
            else if (consumo <= 15) {
                System.out.println("valor a pagar: $35");
            } else if (consumo>15 && consumo<=30) {
                consumo = (consumo-15)*4.50;
                System.out.println("Valor a ser pago com os acrecimos: "+ "$"+consumo);
            }else {
                consumo = (consumo-15)*7;
                System.out.println("consumo de àgua muito alto acrescimo de 7 reais por metrocubico: "+ "$"+consumo);
            }
            sc.close();


        }

    }
}
