package exercicios.MetodoComRetorno;

public class MetodoCRetorno1 {
    public String anoAtual(){
        return "2025";
    }

    public static void main(String[] args){
        MetodoCRetorno1 ano = new MetodoCRetorno1();
        System.out.println("Estamos no ano de " + ano.anoAtual());
    }
}
