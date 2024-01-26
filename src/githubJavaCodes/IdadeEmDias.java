package githubJavaCodes;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nDias, ano, mes, dia;
        mes = 0;
        dia = 0;
        ano = 0;

        nDias = s.nextInt();
        if ( nDias >= 365){
            ano = nDias / 365;
            nDias -= ano*365;
        }
        if (nDias > 29 && nDias < 365) {
            mes = nDias / 30;
            nDias -= mes*30;
            dia = nDias;
        } else {
            dia = nDias;
        }

        System.out.println(ano+" ano(s)");
        System.out.println(mes+" mes(es)");
        System.out.println(dia+" dia(s)");
    }
}
