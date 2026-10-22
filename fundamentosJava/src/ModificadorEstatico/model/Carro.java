package ModificadorEstatico.model;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public void imprime() {
        System.out.println("-----------------");
        System.out.println("Nome "+this.nome);
        System.out.println("Velocidade máxima "+this.velocidadeMaxima);
        System.out.println("Velocidade limite "+Carro.velocidadeLimite);
    }
    public static void setVlocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velocidadeMaxima = velocidadeMedia;
    }



    public String getNome() {
        return nome;
    }



}
