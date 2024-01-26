package githubJavaCodes;

import java.util.Scanner;

public class OMaior {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c, m;

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        if (a >= b && a >= c){
            m = a;
        } else if (b >= a && b >= c) {
            m = b;
        } else {
            m = c;
        }
        System.out.println(m + " eh o maior");
    }
}
