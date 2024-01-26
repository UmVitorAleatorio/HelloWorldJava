package githubJavaCodes;

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b, SOMA;

        a = s.nextInt();
        b = s.nextInt();
        SOMA = a+b;
        System.out.println("SOMA = "+SOMA);
    }
}