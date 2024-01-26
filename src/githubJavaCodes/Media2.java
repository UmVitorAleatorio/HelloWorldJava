package githubJavaCodes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a,b,c, MEDIA;

        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0");
        MEDIA = ((2*a)+(3*b)+(5*c))/10;
        System.out.println("MEDIA = "+df.format(MEDIA));
    }
}
