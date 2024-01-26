package githubJavaCodes;

import java.text.DecimalFormat;
import java.util.Scanner;


public class AreaDoCirculo{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, pi = 3.14159, r;
        r = s.nextDouble();
        a = pi*(r*r);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0000");
        System.out.println("A="+df.format(a));
    }
}
