package githubJavaCodes;

import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dinheiro, divDinheiro, cem, cinq, vinte, dez, cinco, dois, um;

        dinheiro = s.nextInt();
        divDinheiro = dinheiro;
        for (cem = 0; dinheiro >= 100; cem++) {
            dinheiro = dinheiro - 100;
        }
        for (cinq = 0; dinheiro >= 50; cinq++) {
            dinheiro = dinheiro - 50;
        }
        for (vinte = 0; dinheiro >= 20; vinte++) {
            dinheiro = dinheiro - 20;
        }
        for (dez = 0; dinheiro >= 10; dez++) {
            dinheiro = dinheiro - 10;
        }
        for (cinco = 0; dinheiro >= 5; cinco++) {
            dinheiro = dinheiro - 5;
        }
        for (dois = 0; dinheiro >= 2; dois++) {
            dinheiro = dinheiro - 2;
        }
        for (um = 0; dinheiro == 1; um++) {
            dinheiro --;
        }
        System.out.println(divDinheiro);
        System.out.println(cem+" nota(s) de R$ 100,00");
        System.out.println(cinq+" nota(s) de R$ 50,00");
        System.out.println(vinte+" nota(s) de R$ 20,00");
        System.out.println(dez+" nota(s) de R$ 10,00");
        System.out.println(cinco+" nota(s) de R$ 5,00");
        System.out.println(dois+" nota(s) de R$ 2,00");
        System.out.println(um+" nota(s) de R$ 1,00");
    }
}
