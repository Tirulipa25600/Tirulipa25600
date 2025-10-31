package exemplos;

public class MetodoComRetorno {
        public String nomeAluno() {
            return "Daiane";
        }

        public static void main(String[] args) {
            MetodoComRetorno aluno = new MetodoComRetorno();
            System.out.println("Nome do Aluno: " + aluno.nomeAluno());
        }
    }
