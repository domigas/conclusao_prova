package questao_3;

public class Conta_Bancaria {
    private double saldo;

   
    public Conta_Bancaria(double saldoInicial) {
        saldo = saldoInicial;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado.");
        } else {
            System.out.println("zero.");
        }
    }
    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " Concluido.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("zero.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Conta_Bancaria conta = new Conta_Bancaria(1000.0);
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        conta.depositar(500.0);
        System.out.println("Saldo atual após depósito: R$" + conta.getSaldo());

        conta.sacar(200.0); 
        System.out.println("Saldo atual após saque: R$" + conta.getSaldo());
    }
}
