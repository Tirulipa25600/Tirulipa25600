package exemplos;

public class MetodosDestrutores {
        @Override
        protected void finalize() {
            System.out.println("Objeto está sendo removido pelo Garbage Collector");
        }

        public static void main(String[] args) {
            MetodosDestrutores exemplo = new MetodosDestrutores();
            exemplo = null;       //Torna objeto disponível para remoção
            System.gc();          //Sugere execução do Garbage Collector
        }
    }
