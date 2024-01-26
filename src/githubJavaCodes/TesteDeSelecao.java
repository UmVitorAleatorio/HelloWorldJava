package githubJavaCodes;

import java.util.Scanner;

public class TesteDeSelecao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c, d, somaAB, somaCD;

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();
        somaCD = c + d;
        somaAB = a + b;
        if (b > c && d > a && somaCD > somaAB && c > 0 && d > 0 && a%2==0){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
}