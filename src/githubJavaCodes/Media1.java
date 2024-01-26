package githubJavaCodes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a,b, MEDIA;

        a = s.nextDouble();
        b = s.nextDouble();
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00000");
        MEDIA = ((3.5*a)+(7.5*b))/11;
        System.out.println("MEDIA = "+df.format(MEDIA));
    }
}