import java.util.Scanner;

public class ConsoleNumber {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade: ");
        idade = x.nextInt();

        System.out.println("Sua idade é: " + idade);

        x.close();

        int idade2 = 18;
        String resultado = (idade2 >= 18) ? "true" : "False";
        System.out.println(resultado);

    }

}
