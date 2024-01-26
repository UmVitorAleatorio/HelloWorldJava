package githubJavaCodes;


import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        String n;
        double sl, v, sa;

        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");
        Scanner s = new Scanner(System.in);

        n = s.nextLine();
        sl = s.nextDouble();
        v = s.nextDouble();
        sa = (v * 0.15)+sl;
        System.out.println("TOTAL = R$ "+df.format(sa));
    }
}
