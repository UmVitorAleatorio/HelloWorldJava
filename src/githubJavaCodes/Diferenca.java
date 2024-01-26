package githubJavaCodes;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        int A,B,C,D, DF;
        Scanner s = new Scanner(System.in);

        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();
        D = s.nextInt();

        DF = A*B - C*D;

        System.out.println("DIFERENCA = "+DF);
    }
}
