package githubJavaCodes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.000");
        int distancia;
        double litros, kml;


        distancia = s.nextInt();
        litros = s.nextDouble();

        kml = distancia / litros;
        System.out.println(df.format(kml)+" km/l");
    }
}