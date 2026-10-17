package Sobrecarga.test;

import Sobrecarga.model.Anime;

public class EpisodiosTest {
    public static void main (String[] args) {
        Anime anime = new Anime();
        anime.init("Coelho", "Sla", 23, "Drama");
        anime.imprime();
    }
}
