package BlocosInicializacao.model;

public class Anime {
    private String nome;
    private int[] episodios;
    {
            System.out.println("Inicialização: ");
            episodios = new int[100];
            for(int i = 0; i < episodios.length; i++) {
                episodios[i] = i+1;
            }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for(int episodio: this.episodios) {
            System.out.println(episodio + "");
        }

    }


}
