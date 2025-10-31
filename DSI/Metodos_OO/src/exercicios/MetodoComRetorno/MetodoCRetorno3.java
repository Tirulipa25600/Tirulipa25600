package exercicios.MetodoComRetorno;

public class MetodoCRetorno3 {
    public String numeroFixo(){
        return "11/06";
    }

    public static void main(String[] args) {
        MetodoCRetorno3 numero = new MetodoCRetorno3();
        System.out.println("Data importante: " + numero.numeroFixo());
    }
}
