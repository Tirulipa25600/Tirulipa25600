package Escola;

import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Digitie seu nome: ");
        String nome = x.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = x.nextInt();

        Aluno dados = new Aluno();

        dados.setNome(nome);

        dados.setIdade(idade);
        dados.mostrardados();

    }

}
