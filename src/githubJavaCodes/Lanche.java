package githubJavaCodes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");
        byte cod, quant;
        double preco;

        cod = s.nextByte();
        quant = s.nextByte();

        if (cod == 1){
            preco = 4.00*quant;
            System.out.println("Total: R$ "+df.format(preco));
        } else if (cod == 2) {
            preco = 4.50*quant;
            System.out.println("Total: R$ "+df.format(preco));
        } else if (cod == 3) {
            preco = 5.00*quant;
            System.out.println("Total: R$ "+df.format(preco));
        } else if (cod == 4) {
            preco = 2.00*quant;
            System.out.println("Total: R$ "+df.format(preco));
        } else if (cod == 5) {
            preco = 1.50*quant;
            System.out.println("Total: R$ "+df.format(preco));
        }
    }
}