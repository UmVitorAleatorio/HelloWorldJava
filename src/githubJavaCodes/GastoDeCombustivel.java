package githubJavaCodes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.000");
        int velMedia, tempoHora, cons = 12;
        double quantLitros;

        velMedia = s.nextInt();
        tempoHora = s.nextInt();
        quantLitros = (double)velMedia * tempoHora / cons;
        System.out.println(df.format(quantLitros));
    }
}