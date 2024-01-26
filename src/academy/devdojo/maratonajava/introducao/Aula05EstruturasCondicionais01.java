package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !

        if(isAutorizadoComprarBebida != false){
            System.out.println("Autorizado a compra bebida alcólica");
        }else{
            System.out.println("Não autorizado a compra bebida alcólica");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a compra bebida alcólica");
        }
        boolean c = false;
        if(c == true){
            System.out.println("dentro de algo que nunca de ser feito");
        }

        System.out.println("Fora do if");
    }
}
