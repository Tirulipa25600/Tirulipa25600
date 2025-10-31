package exemplos;

public class MetodosGttStt {
        private String nome;
        //Setter
        public void setNome(String nome) {

            this.nome = nome;
        }
        //Getter
        private String getNome() {

            return nome;
        }
            private static void main(String[] args) {
            MetodosGttStt pessoa = new MetodosGttStt();
            pessoa.setNome("DayDay");
            System.out.println("Nome: " + pessoa.getNome());
        }
    }
