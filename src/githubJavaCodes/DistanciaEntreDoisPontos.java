package githubJavaCodes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0000");
        double x1, y1, x2, y2, rQ;

        x1 = s.nextDouble();
        y1 = s.nextDouble();
        x2 = s.nextDouble();
        y2 = s.nextDouble();

        rQ = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println(df.format(rQ));
    }
}