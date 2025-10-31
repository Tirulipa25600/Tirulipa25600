package exercicios.MetodoSemRetorno;

public class MetodoSRetorno1 {
    public void recebaMensage(String nome){
        System.out.println("Mutcha coisa, né " + nome + "?");
    }

    public static void main(String[] args){
        MetodoSRetorno1 rec = new MetodoSRetorno1();
        rec.recebaMensage("Day");
    }
}
