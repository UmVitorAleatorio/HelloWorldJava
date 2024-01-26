package githubJavaCodes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        int n,h;
        double sh, sf;

        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        h = s.nextInt();
        sh = s.nextDouble();
        sf = sh * h;
        System.out.println("NUMBER = "+n);
        System.out.println("SALARY = U$ "+df.format(sf));
    }
}
