package Instanciar;

import java.util.Scanner;

public class Calculadora {
    Scanner calc = new Scanner(System.in);

    String nome;
    int idade;

    double a;
    double b;
    double res;

    void dados() {
        System.out.println("Digite seu nome : ");
        nome = calc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = calc.nextInt();

        System.out.println("Seu nome é: " + nome + "\n" +
                "Sua idade é: " + idade);
    }

    void somar() {

        System.out.println("Digite o valor de A: ");
        a = calc.nextDouble();

        System.out.println("Digite o valor de B: ");
        b = calc.nextDouble();

        double res = a + b;
        System.out.println("O valor da soma é: " + res);
        calc.close();
    }
}
