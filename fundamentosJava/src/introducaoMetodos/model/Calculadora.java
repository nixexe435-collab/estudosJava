package introducaoMetodos.model;

public class Calculadora {
    public void somaDoisNum() {
        System.out.println(10 + 10);
    }
    public void subtraiDoisNum() {
        System.out.println(10 - 10);
    }
    public void multiplicaDoisNum(int num1, int num2) {
             System.out.println(num1 * num2);
    }
    public double divideDoisNum(double num1, double num2) {
        return num1 / num2;
    }
    public void alteraDoisNum(int num1, int num2) {
        num1 = 99;
        num2 = 38;
        System.out.println("Dentro do método");
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
    }
    public void somaArray(int[] numeros) {
        int soma = 0;
        for(int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for(int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
