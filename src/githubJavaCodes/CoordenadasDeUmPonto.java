package githubJavaCodes;

import java.util.Scanner;

public class CoordenadasDeUmPonto {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float x,y;

        x = s.nextFloat();
        y = s.nextFloat();

        if(x == 0 && y == 0){
            System.out.println("Origem");
        }else if(x > 0 && y > 0){
            System.out.println("Q1");
        }else if(x > 0 && y < 0){
            System.out.println("Q4");
        }else if(x < 0 && y < 0){
            System.out.println("Q3");
        }else if (x < 0 && y > 0){
            System.out.println("Q2");
        } else if (x == 0 && y != 0) {
            System.out.println("Eixo Y");
        } else {
            System.out.println("Eixo X");
        }
    }
}