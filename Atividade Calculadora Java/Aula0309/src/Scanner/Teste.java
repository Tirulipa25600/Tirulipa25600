package Scanner;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        calc.somar();
        calc.subtracao();
        calc.multiplicacao();
        calc.divisao();
        calc.quadrado();
        calc.retangulo();
        calc.triangulo();
        calc.cone();
        calc.cubo();
    }
}
