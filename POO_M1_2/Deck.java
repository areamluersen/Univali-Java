/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.aula03;

/**
 *
 * @author Aream_Gustavo
 */
public class Deck{

    Carta[] deck = new Carta[52];
    private int cont = 0;
    /**
     * Default constructor Cria o Deck
     */
    public Deck() {
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 13; j++){
                deck[cont] = new Carta(i,j);
                cont++;
            }
        }
    }

    /**
     * Embaralha as 52 cartas criadas.
     */
    public void shuffle() {
        
    }

    /**
     * @param id Retorna a carta com o ID (posição) especificada
     * @return 
     */
    public String getCard(int id) {
        return deck[id-1].getValue().getDescription();
    }

    /**
     *  Retorna todas as Cartas Criadas.
     */
    public void getAll() {
        
    }

}
