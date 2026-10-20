package Construtores.test;

import Construtores.model.Anime;

public class EpisodiosTest {
    public static void main (String[] args) {
        Anime anime = new Anime("Sla", "Sla", 4, "Ação", "Sla");
       // anime.init("Coelho", "Sla", 23, "Drama");
        anime.imprime();
    }
}
