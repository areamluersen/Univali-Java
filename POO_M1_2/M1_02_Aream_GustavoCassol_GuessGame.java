package br.univali.kob.poo1.aula03;

/**
 * Main do programa.
 * 
 * @author Aream e Gustavo
 */
public class M1_02_Aream_GustavoCassol_GuessGame {

    /**
     * Cria os objetos e roda o jogo.
     * 
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        //DeckTest test = new DeckTest();
        //test.rodar();
        Player jogador = new Player();
        Game jogo = new Game();
        jogador.setNome();
        jogador.addPontos(jogo.jogar());
        UserInterface.pontosDoJogador(jogador.getNome(), jogador.getPontos());
    }
    
}
