package githubJavaCodes;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b, c, per, area;

        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        if (a+b > c && a+c > b && b+c > a){
            per = a+b+c;
            System.out.println("Perimetro = "+per);
        }else{
            area = (a+b) * c/2;
            System.out.println("Area = "+area);
        }
    }
}
