package academy.devdojo.maratonajava.introducao;

public class pratica03 {
    public static void main(String[] args) {
        // Imprima todos os numeros pares de 0 até 1000000

        for (int i = 0; i < 100; i ++){
            if (i %2 == 1){
                i++;
            }
            System.out.println(i);
        }
    }
}
