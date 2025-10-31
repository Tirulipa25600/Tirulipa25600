package exemplos;

    public class MetodoSimples {
        public void exibirSaudacao() {

            System.out.println("Seja bem-vindo à aula de Java");
        }

        public static void main(String[] args) {
            MetodoSimples mensagem = new MetodoSimples();
            mensagem.exibirSaudacao();
        }
    }