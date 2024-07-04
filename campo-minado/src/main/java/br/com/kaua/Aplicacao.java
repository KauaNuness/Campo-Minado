package br.com.kaua;

import br.com.kaua.modelo.Tabuleiro;
import br.com.kaua.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(10,6,10);
        new TabuleiroConsole(tabuleiro);

    }
}
