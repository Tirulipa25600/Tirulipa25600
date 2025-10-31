package exemplos;

public class MetodoSemRetorno {
        public void imprimirNome(String nome) {
            System.out.println("Nome recebido: " + nome);
        }

        public static void main(String[] args){
            MetodoSemRetorno imp = new MetodoSemRetorno();
            imp.imprimirNome("João Pedro");
        }
    }
