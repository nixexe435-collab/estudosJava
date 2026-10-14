package introducaoMetodos.test;

import introducaoMetodos.model.Estudante;
import introducaoMetodos.model.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main (String[] args) {
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Nicolas";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        estudante02.nome = "Isa";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        impressora.imprime(estudante02);

    }
}
