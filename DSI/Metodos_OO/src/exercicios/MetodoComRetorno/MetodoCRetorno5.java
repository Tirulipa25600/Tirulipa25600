package exercicios.MetodoComRetorno;

public class MetodoCRetorno5 {
    public String valorPI(){
        return "3,14159";
    }

    public static void main(String[] args){
        MetodoCRetorno5 pi = new MetodoCRetorno5();
        System.out.println("Esse é o verdadeiro valor de PI: " + pi.valorPI());
    }

}
