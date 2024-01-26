package githubJavaCodes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.000");
        double a, b, c, pi = 3.14159, tri, cir, tra, qua, ret;

        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        tri = a*c/2;
        cir = pi * (c*c);
        tra = (a+b) * c/2;
        qua = b*b;
        ret = a*b;

        System.out.println("TRIANGULO: "+df.format(tri));
        System.out.println("CIRCULO: "+df.format(cir));
        System.out.println("TRAPEZIO: "+df.format(tra));
        System.out.println("QUADRADO: "+df.format(qua));
        System.out.println("RETANGULO: "+df.format(ret));
    }
}
