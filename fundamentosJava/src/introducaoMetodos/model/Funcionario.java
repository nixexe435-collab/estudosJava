package introducaoMetodos.model;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios = new double[3];
    private double media;

    public void imprimirDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);

    }

    public void mediaSalario() {

        for(double s: salarios) {
            media += s;

        }
        media /= salarios.length;
        System.out.printf("Média dos salários: %.2f\n", media);

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
