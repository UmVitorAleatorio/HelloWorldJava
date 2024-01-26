package academy.devdojo.maratonajava.introducao;

public class pratica02 {
    public static void main(String[] args) {
        // salario >= 0 && < 34713 =  9.70%
        // salario >= 34713 && < 68508 = 37.35%
        // salario = 49.50%

        double salario = 70000;
        String respostaProgramada = "Você terá que pagar ";
        double valorParaPagar;
//        String salarioPorcentagem;

        if (salario >= 0 && salario < 34713){
            valorParaPagar = salario * 0.0970;
//            salarioPorcentagem = " 9.70%";
        } else if (salario >= 34713 && salario < 68508) {
            valorParaPagar = salario * 0.3735;
//            salarioPorcentagem = " 37.35%";
        } else {
            valorParaPagar = salario * 0.4950;
//            salarioPorcentagem = " 49.50%";
        }
        System.out.println(respostaProgramada+valorParaPagar);//+salarioPorcentagem);

    }
}
