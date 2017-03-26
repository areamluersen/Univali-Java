package br.univali.kob.poo1.aula03;

/**
 * Testa métodos da classe 'Deck'.
 * 
 * @author Aream e Gustavo.
 */
public class DeckTest {

    /**
     * Default constructor.
     */
    public DeckTest () {
    }
    
    /**
     * Lista as cartas do deck no terminal.
     * 
     * @param deck Objeto 'Deck' que contém 52 objetos 'Carta'.
     */
    public void printAll (Deck deck){
        for(int i=0; i<52; i++){
            System.out.println ("Carta " + i + ": " + deck.getCard (i).getDescriptionValue () + " de " + deck.getCard (i).getDescriptionSuit ());
        }
    }
    
    /**
     * Testa os métodos da classe 'Deck'.
     */
    public void rodar (){
        Deck deck = new Deck ();
        System.out.println ("NA ORDEM:");
        printAll (deck);
        deck.shuffle ();
        System.out.println ("EMBARALHADO:");
        printAll (deck);
    }
        
}