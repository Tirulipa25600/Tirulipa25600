package exemplos;

public class MetodosConstrutores {
        String nome;
        public MetodosConstrutores(String nome) {
            this.nome = nome;
        }
        public void exibirAluno() {
            System.out.println("Aluno: " + nome);
        }

        public static void main(String[] args) {
            MetodosConstrutores aluno = new MetodosConstrutores("Marques");
            aluno.exibirAluno();
        }
}
