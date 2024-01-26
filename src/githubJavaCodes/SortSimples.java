package githubJavaCodes;

import java.util.Scanner;

public class SortSimples {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1,n2,n3;

        n1 = s.nextInt();
        n2 = s.nextInt();
        n3 = s.nextInt();

        if(n1 >= n2 && n1 >= n3){
            if(n2 >= n3){
                System.out.println(n3);
                System.out.println(n2);
                System.out.println(n1);
                System.out.println();
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
            }else{
                System.out.println(n2);
                System.out.println(n3);
                System.out.println(n1);
                System.out.println();
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
            }
        }else if(n2 >= n1 && n2 >= n3){
            if(n1 >= n3){
                System.out.println(n3);
                System.out.println(n1);
                System.out.println(n2);
                System.out.println();
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
            }else{
                System.out.println(n1);
                System.out.println(n3);
                System.out.println(n2);
                System.out.println();
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
            }
        }else if(n3 >= n2 && n3 >= n1){
            if(n2 >= n1){
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
                System.out.println();
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
            }else{
                System.out.println(n2);
                System.out.println(n1);
                System.out.println(n3);
                System.out.println();
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
            }
        }
    }
}

