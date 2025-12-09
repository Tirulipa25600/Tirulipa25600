import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner contaCorrente = new Scanner(System.in);

        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite seu nome: ");
        nomeCliente = contaCorrente.nextLine();

        System.out.println("Digite o saldo: ");
        saldo = contaCorrente.nextDouble();

        System.out.println("Sr. (a): " + nomeCliente);
        System.out.println("Número da Agência Bancária: " + agencia);
        System.out.println("Número da Conta Corrente: " + contaCorrente);
        System.out.println("Valor do saldo atual é de R$" + saldo);
        // close();
    }
}
