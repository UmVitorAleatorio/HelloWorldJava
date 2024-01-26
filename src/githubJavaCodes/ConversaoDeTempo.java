package githubJavaCodes;

import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, hr, min, seg;
        min = 0;
        seg = 0;
        hr = 0;

        n = s.nextInt();
        if(n > 3599){
            hr = n / 60 / 60;
            n -= 3600 * hr;
            if(n > 60 && n <3600){
                min = n / 60;
                n -= 60*min;
                seg = n;
            } else {
                seg = n;
            }
        }

        if (n > 60 && n <3600) {
            min = n / 60;
            n -= 60*min;
            seg = n;
        } else {
            seg = n;
        }

        System.out.println(hr+":"+min+":"+seg);
    }
}