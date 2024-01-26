package githubJavaCodes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vInt = 4;
        long raio;
        double pi = 3.14159, vDouble = 3.0, volume;

        raio = s.nextInt();
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.000");
        volume = (vInt/vDouble) * pi * (raio*raio*raio);
        System.out.println("VOLUME = "+df.format(volume));
    }
}
