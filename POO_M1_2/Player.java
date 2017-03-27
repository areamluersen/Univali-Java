package br.univali.kob.poo1.aula03;

/**
 * Classe que contém o nome a pontuação do jogador.
 * 
 * @author Aream e Gustavo
 */
public class Player {
    
    /**
     * Default contructor que inicia a potuação do jogador como 0.
     */
    public Player (){
        pontos = 0;
    }
    
    /**
     * Nome do jogador.
     */
    private String nome;
    
    /**
     * Pontuação do jogador.
     */
    private int pontos;
    
    /**
     * Getter.
     * 
     * @return Nome do jogador. 
     */
    public String getNome(){
        return nome;
    }
    
    /**
     * Setter.
     */
    public void setNome(){
        nome = UserInterface.inputNome();
    }
    
    /**
     * Getter.
     * 
     * @return Pontuação do jogador.
     */
    public int getPontos(){
        return pontos;
    }
    
    /**
     * Adiciona os pontos do jogador com os pontos novos do jogo.
     * 
     * @param novosPontos Pontos adquiridos com o jogo.
     */
    public void addPontos (int novosPontos){
        pontos = pontos + novosPontos;
    }
    
}
