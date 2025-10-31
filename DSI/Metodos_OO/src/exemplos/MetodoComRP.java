package exemplos;

public class MetodoComRP {
        public int multiplicar(int x, int y) {
            return x * y;
        }
        public static void main(String[] args) {
            MetodoComRP calc = new MetodoComRP();
            int resultado = calc.multiplicar(4, 5);
            System.out.println("Resultado: " + resultado);
        }
    }
