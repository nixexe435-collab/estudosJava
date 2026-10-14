package introducaoclasses.test;

import introducaoclasses.model.Carro;

public class CarroTest01 {
    public static void main (String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Fiat";
        carro01.modelo = "Uno";
        carro01.ano = 2012;

        carro02.nome = "Honda";
        carro02.modelo = "Civic";
        carro02.ano = 2012;

        System.out.println(carro01.nome);
        System.out.println(carro01.modelo);
        System.out.println(carro01.ano);



        System.out.println(carro02.nome);
        System.out.println(carro02.modelo) ;
        System.out.println(carro02.ano);
    }
}
