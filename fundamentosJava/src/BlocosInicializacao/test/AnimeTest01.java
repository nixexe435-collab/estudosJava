package BlocosInicializacao.test;

import BlocosInicializacao.model.Anime;

public class AnimeTest01 {
    public static void main (String[] args) {
        Anime anime = new Anime("Sla");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + "");
        }


    }
}
