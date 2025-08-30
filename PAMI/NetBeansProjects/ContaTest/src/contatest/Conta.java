package contatest;

public class Conta {
    public double saldo;
    public  String cliente;
    
    
    public void sacar(double valor) {
    
        //saldo = saldo - valor;
        saldo -= valor;
    }
    
     public void depositar(double valor) {
    
        //saldo = saldo + valor;
        saldo += valor;
    }

    public void exibirSaldo() {
        System.out.println(cliente + ", seu saldo é R$" + saldo);
    }
}
