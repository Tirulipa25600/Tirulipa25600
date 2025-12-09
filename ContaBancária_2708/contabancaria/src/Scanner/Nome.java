package Scanner;

import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);

        String nome;

        System.out.println("Digite seu nome: ");
        nome = cc.nextLine();

        System.out.println("Seu nome é: " + nome);

        cc.close();

    }

}
