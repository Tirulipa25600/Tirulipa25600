package contatest;

public class ContaTest {

   
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        
        conta.cliente = "Josefino";
        conta.saldo = 300;
        
        conta.exibirSaldo();
    }
    
}
