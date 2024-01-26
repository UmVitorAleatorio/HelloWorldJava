package githubJavaCodes;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dist, tempo;

        dist = s.nextInt();

        tempo = dist * 2;
        System.out.println(tempo+" minutos");
    }
}