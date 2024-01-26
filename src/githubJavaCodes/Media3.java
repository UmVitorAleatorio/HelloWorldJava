package githubJavaCodes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0");
        float n1, n2, n3, n4, nE , med;

        n1 = s.nextFloat();
        n2 = s.nextFloat();
        n3 = s.nextFloat();
        n4 = s.nextFloat();

        n1 *= 2;
        n2 *= 3;
        n3 *= 4;
        med = (n1+n2+n3+n4)/10;


        if (med < 5){
            System.out.println("Media: "+df.format(med));
            System.out.println("Aluno reprovado.");
        }else if (med >= 5 && med < 7){
            nE = s.nextFloat();
            System.out.println("Media: "+df.format(med));
            System.out.println("Aluno em exame.");
            System.out.println("Nota do exame: "+nE);
            med = (med + nE)/2;
            if (med >= 5){
                System.out.println("Aluno aprovado.");
            }else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: "+df.format(med));
        }else {
            System.out.println("Media: "+df.format(med));
            System.out.println("Aluno aprovado.");
        }
    }
}