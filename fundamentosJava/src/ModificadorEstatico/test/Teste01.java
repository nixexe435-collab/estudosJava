package ModificadorEstatico.test;

import ModificadorEstatico.model.Carro;

public class Teste01 {
    public static void main (String[] args) {
        Carro.setVlocidadeLimite(180);
        Carro carro = new Carro("Fusca",280);
        Carro carro2 = new Carro("Fiat", 275);
        Carro carro3 = new Carro("BMW", 290);
        carro.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
