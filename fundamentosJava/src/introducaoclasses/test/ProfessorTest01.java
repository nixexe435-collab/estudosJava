package introducaoclasses.test;

import introducaoclasses.model.Professor;

public class ProfessorTest01 {
    public static void main (String[] args) {
        Professor professor = new Professor();
        professor.nome = "Arnaldo";
        professor.idade = 48;
        professor.sexo = 'M';

        System.out.println(professor.nome);
        System.out.println(professor.idade);
        System.out.println(professor.sexo);
    }
}
