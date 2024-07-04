package br.com.kaua;

import br.com.kaua.modelo.Tabuleiro;
import br.com.kaua.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
        new TabuleiroConsole(tabuleiro);

    }
}
