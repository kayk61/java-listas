package java_lista_8_5;

public class at2 {
    public static void main(String[] args) {
        //2. Sequência de Fibonacci Específica: Inicialize os dois primeiros termos da
        //série de Fibonacci (0 e 1). Faça: calcule o próximo termo (soma dos dois
        //anteriores). Se o novo termo for ímpar E múltiplo de 3, adicione-o a uma
        //variável de soma total. Enquanto o termo gerado for menor que 50.000.
        //Exiba a soma final.
        int fibon1,fibon2,soma,somatotal;
        somatotal = 0;
        soma = 0;
        fibon1 = 0;
        fibon2 = 1;

        while (somatotal < 50000) {
            fibon1 = fibon2;
            fibon2 = soma;
            soma = fibon1+fibon2;
            if (soma%2!=0 && soma%3==0) {
                somatotal = somatotal+soma;
                System.out.println(somatotal);

            }

        }

    }
}
