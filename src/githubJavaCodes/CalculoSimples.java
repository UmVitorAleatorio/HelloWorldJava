package githubJavaCodes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        byte quant1, quant2;
        short cod1, cod2;
        float preco1, preco2, vParaPagar;
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");
        Scanner s = new Scanner(System.in);

        cod1 = s.nextShort();
        quant1 = s.nextByte();
        preco1 = s.nextFloat();
        cod2 = s.nextShort();
        quant2 = s.nextByte();
        preco2 = s.nextFloat();
        vParaPagar = (preco1*quant1) + (preco2*quant2);
        System.out.println("VALOR A PAGAR: R$ "+df.format(vParaPagar));
    }
}