package lista_5_java;

public class at9 {
    public static void main(String[] args) {
        int n,cont,som;
        n=2;
        cont = 0;
        som = 0;

        while (cont<25) {
            cont = cont+1;
            som = som+n;

            System.out.println(som);
            n = n+2;
        }
    }
}
