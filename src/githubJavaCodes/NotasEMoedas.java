package githubJavaCodes;

import java.util.Scanner;

public class NotasEMoedas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double valor, moedaUm = 0, centCinquenta = 0, centVinteCinco = 0, centDez = 0, centCinco = 0, centUm = 0;
        int notaCem = 0, notaCinquenta = 0, notaVinte = 0, notaDez = 0, notaCinco = 0, notaDois = 0;

        valor = s.nextDouble();
        if (valor >= 100){
            notaCem = (int) valor/100;
            valor -= notaCem*100;
        }
        if (valor < 100 && valor >= 50){
            notaCinquenta = (int) valor/50;
            valor -= notaCinquenta*50;
        }
        if (valor < 50 && valor >= 20){
            notaVinte = (int) valor/20;
            valor -= notaVinte*20;
        }
        if (valor < 20 && valor >= 10){
            notaDez = (int) valor/10;
            valor -= notaDez*10;
        }
        if (valor < 10 && valor >= 5){
            notaCinco = (int) valor/5;
            valor -= notaCinco*5;
        }
        if (valor < 5 && valor >= 2){
            notaDois = (int) valor/2;
            valor -= notaDois*2;
        }
        if (valor < 2 && valor >= 1){
            moedaUm = (int)valor;
            valor--;
        }
        if (valor < 1 && valor >= 0.50){
            centCinquenta = 1;
            valor -= 0.50;
        }
        if (valor < 0.50 && valor >= 0.25){
            centVinteCinco = 1;
            valor -= 0.25;
        }
        if (valor < 0.25 && valor >= 0.10){
            centDez = valor / 0.10;
            valor -= 0.10 * (int)centDez;
        }
        if (valor < 0.10 && valor >= 0.05) {
            centCinco = 1;
            valor -= 0.049;
        }
        if (valor < 0.05 && valor >= 0.01){
            centUm = 100 * valor;
            valor -= 0.01 * centUm;
        }
        System.out.println("NOTAS:");
        System.out.println(notaCem+" nota(s) de R$ 100.00");
        System.out.println(notaCinquenta+" nota(s) de R$ 50.00");
        System.out.println(notaVinte+" nota(s) de R$ 20.00");
        System.out.println(notaDez+" nota(s) de R$ 10.00");
        System.out.println(notaCinco+" nota(s) de R$ 5.00");
        System.out.println(notaDois+" nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int)moedaUm+" moeda(s) de R$ 1.00");
        System.out.println((int)centCinquenta+" moeda(s) de R$ 0.50");
        System.out.println((int)centVinteCinco+" moeda(s) de R$ 0.25");
        System.out.println((int)centDez+" moeda(s) de R$ 0.10");
        System.out.println((int)centCinco+" moeda(s) de R$ 0.05");
        System.out.println((int)centUm+" moeda(s) de R$ 0.01");
    }
}