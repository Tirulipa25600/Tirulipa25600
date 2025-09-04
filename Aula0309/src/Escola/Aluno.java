package Escola;

public class Aluno {

    String nome;
    int idade;

    public void mostrardados() {
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

}
