package introducaoMetodos.test;

import introducaoMetodos.model.Calculadora;

public class CalculadoraTest03 {
    public static void main (String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNum(20, 5);
        System.out.println(result);
    }
}
