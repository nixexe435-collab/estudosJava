package introducaoMetodos.test;

import introducaoMetodos.model.Funcionario;

public class FuncionarioTest01 {
    public static void main (String[] args) {
        Funcionario funcionario = new Funcionario();


        funcionario.setNome("Nico");
        funcionario.setIdade(18);

        funcionario.setSalarios(new double[] {1200, 1300, 1500});


        funcionario.imprimirDados();
        funcionario.mediaSalario();


    }
}
