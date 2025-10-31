package exercicios.MetodoSemRetorno;

import static java.lang.System.out;

public class MetodoSRetorno2 {
    private String soma;
    public int multiplicar(int x, int y) {
        soma = String.valueOf(x + y);

        return x;
    }
    public static void mian(String[] args) {
        MetodoSRetorno2 imp = new MetodoSRetorno2();
        int resultado = imp.multiplicar(3,  6);
        System.out.println("Seu resultado: " + resultado);
    }
}
