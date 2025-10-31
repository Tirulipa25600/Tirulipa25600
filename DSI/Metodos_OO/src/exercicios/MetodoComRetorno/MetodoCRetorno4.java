package exercicios.MetodoComRetorno;

public class MetodoCRetorno4 {
    public boolean valorFixo(){
        return true;
        }

        public static void main(String[] args) {
            MetodoCRetorno4 ver = new MetodoCRetorno4();
            boolean resultado = ver.valorFixo();
            System.out.println("O Mentiroso devolveu " + resultado + " shares");
        }
}
