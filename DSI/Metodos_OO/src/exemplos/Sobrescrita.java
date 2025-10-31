package exemplos;

public class Sobrescrita {
        public static void main(String[] args) {
            MetodoSobrescrita metodoSobrescrita = new MetodoSobrescrita();
            MetodoSobrescrita cachorro = new Cachorro();

            metodoSobrescrita.emitirSom();
            cachorro.emitirSom();
        }
    }