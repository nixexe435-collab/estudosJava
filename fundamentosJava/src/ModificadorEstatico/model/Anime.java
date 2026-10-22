package ModificadorEstatico.model;

public class Anime {
    private String nome;
    private static int[] episodios;
    static{
            System.out.println("Inicialização: ");
            episodios = new int[100];
            for(int i = 0; i < episodios.length; i++) {
                episodios[i] = i+1;
            }
    }

    public void setNome(String nome) {
        this.nome = nome;
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

        for(int episodio: Anime.episodios) {
            System.out.println(episodio + "");
        }

    }


}
