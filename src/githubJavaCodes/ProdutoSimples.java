package githubJavaCodes;

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b, PROD;

        a = s.nextInt();
        b = s.nextInt();
        PROD = a*b;
        System.out.println("PROD = "+PROD);
    }
}