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
    
    public void printAll(Deck deck){
        for(int i=0; i<52; i++){
            System.out.println("Carta " + i + ": " +
                deck.getCard(i).getDescriptionValue() + " de " +
                deck.getCard(i).getDescriptionSuit());
        }
    }
    
    /**
     * 
     */
    public void rodar() {
        Deck deck = new Deck();
        //printAll(deck);
        deck.shuffle();
        printAll(deck);
    }
        
}