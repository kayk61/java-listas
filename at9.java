package java_lista_4;

import java.util.Scanner;

public class at9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite uma letra");
        char v =sc.next().charAt(0);

        if (v == 'a'|| v== 'e'|| v== 'i'|| v=='o'|| v=='u') {
            System.out.println("A letra digitada foi uma vogal");
        }else {
            System.out.println("A letra digitada foi uma consoante");
        }
        sc.close();
    }
}
