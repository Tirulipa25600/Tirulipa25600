package exercicios.MetodoComRetorno;

public class MetodoCRetorno2 {
    public String myName(){
        return "Diana Portela Lawrence";
    }

    public static void main(String[] args){
        MetodoCRetorno2 name = new MetodoCRetorno2();
        System.out.println("My name is: " + name.myName());
    }
}
