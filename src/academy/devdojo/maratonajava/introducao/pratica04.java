package academy.devdojo.maratonajava.introducao;

public class pratica04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser pacelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 30000, valorParcela = valorCarro;

        for (int quantidadeDeParcela = 1; valorParcela >= 1000; quantidadeDeParcela++) {
            valorParcela = valorCarro / quantidadeDeParcela;
            System.out.println("Você pode parcelar em "+quantidadeDeParcela + " parcelas de R$ " + valorParcela);
            if(valorParcela <=1000){
                break;
            }
        }
    }
}
