package introducaoMetodos.test;

import introducaoMetodos.model.Pessoa;

public class PessoaTest01 {
    public static void main (String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Nicole");
        pessoa.setIdade(18);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
