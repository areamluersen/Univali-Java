package br.univali.kob.poo1.aula03;

/**
 * Classe que contém os atributos que descrevem uma carta de baralho.
 * 
 * @author Aream e Gustavo.
 */
public class Carta {

    /**
     * Default constructor.
     * 
     * @param naipe Naipe da carta.
     * @param num Número da carta.
     */
    public Carta (int naipe, int num) {
        setValue (num);
        setSuit (naipe);
    }
    
    /**
     * Naipe da carta.
     */
    private Suit suit;

    /**
     * Número da carta.
     */
    private Value value;

    /**
     * Getter.
     * 
     * @return Naipe da carta em forma de String.
     */
    public String getDescriptionSuit (){
        return suit.getDescription ();
    }
    
    /**
     * Getter.
     * 
     * @return Naipe da carta em forma de int.
     */
    public int getNumSuit (){
        return suit.getNum ();
    }
    
    /**
     * Setter.
     * 
     * @param naipe Naipe da carta.
     */
    public void setSuit (int naipe) {
        switch (naipe){
        case 0: this.suit = suit.SPADES; break;
        case 1: this.suit = suit.HEARTS; break;
        case 2: this.suit = suit.CLUBS; break;
        case 3: this.suit = suit.DIAMONDS; break; 
        }
    }
 
    /**
     * Getter.
     * 
     * @return Número da carta em forma de String.
     */
    public String getDescriptionValue (){
        return value.getDescription ();
    }
    
    /**
     * Getter.
     * 
     * @return Número da carta em forma de int.
     */
    public int getNumValue (){
        return value.getNum ();
    }

    /**
     * Setter.
     * 
     * @param num Número da carta.
     */
    public void setValue (int num) {
        switch (num){
            case 0: this.value = value.A; break;
            case 1: this.value = value.DOIS; break;
            case 2: this.value = value.TRES; break;
            case 3: this.value = value.QUATRO; break;
            case 4: this.value = value.CINCO; break;
            case 5: this.value = value.SEIS; break;
            case 6: this.value = value.SETE; break;
            case 7: this.value = value.OITO; break;
            case 8: this.value = value.NOVE; break;
            case 9: this.value = value.DEZ; break;
            case 10: this.value = value.JACK; break;
            case 11: this.value = value.QUEEN; break;
            case 12: this.value = value.KING; break;
        }
    }

}
