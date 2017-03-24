package br.univali.kob.poo1.aula03;

/**
 * @author Aream e Gustavo
 */
public class DeckTest {

    /**
     * Default constructor
     */
    public DeckTest() {
    }

    /**
     * 
     */
    public void rodar() {
        Deck deck = new Deck();
        
        //printar todas as cartas
        
        for(int i=0; i<52; i++){
        deck.getCard(i);
        System.out.println();
        }
    }
        
}