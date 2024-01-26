package academy.devdojo.maratonajava.introducao;

/*
Prática 1

Crie variáveis para os campos descritos abaixo entre <> e impria a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
 */
public class Pratica01 {
    public static void main(String[] args) {
        String nameUser = "DevDojo";
        String address = "Rua YoutubeBrasil, DevDojo 59400";
        int salary = 5000; //poderia/deveria ter usado double, ou float
        String date = "10/01/2024";

        System.out.println("Eu "+nameUser+", morando no endereço "+address+", confirmo que recebi o salário de "+salary+", na data "+date);
    }
}
