package questao_7;

public class Banco {
   
    private static double taxa_positiva = 0.05;

    private static double taxa_negativa = 0.10; 

    public static double calculaTaxa(double saldo) {
        if (saldo >= 0) {
            
            return saldo * taxa_positiva;
        } else {
            
            return saldo * taxa_negativa;
        }
    }

    public static void main(String[] args) {
        double saldoPositivo = 100;
        double saldoNegativo = -55;

        double resultado = Banco.calculaTaxa(saldoPositivo);
        double resultadoNegativo = Banco.calculaTaxa(saldoNegativo);

        System.out.println("Taxa de juros para saldo positivo: " + resultado );
        System.out.println("Taxa de juros para saldo negativo: " + resultadoNegativo);
    }
}
