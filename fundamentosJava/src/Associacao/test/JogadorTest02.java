package Associacao.test;

import Associacao.model.Jogador;
import Associacao.model.Time;

public class JogadorTest02 {
    public static void main (String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Time time = new Time("Seleçao brasileira");

        jogador01.setTime(time);

        jogador01.imprime();
    }
}
