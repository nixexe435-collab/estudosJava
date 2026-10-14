package introducaoMetodos.test;

import introducaoMetodos.model.Calculadora;

public class CalculadoraTeste04 {
    public static void main (String [] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNum(num1, num2);
        System.out.println("Dentro da calculadora teste");
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
    }
}
