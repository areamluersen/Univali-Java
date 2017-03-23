package br.univali.kob.poo1.aula03;

/**
 *
 * @author Aream
 */
public class Carta {

    /**
     * Default constructor
     */
    public Carta(int naipe, int nr) {
        setValue(nr);
        setSuit(naipe);
    }

    
    /**
     * Naipe das cartas
     */
    private Suit suit;

    /**
     * Valor das cartas
     */
    private Value value;
    /**
     * @return Retorna Naipe da carta
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @param naipe
     */
    public void setSuit(int naipe) {
        switch (naipe){
        case 0: this.suit = suit.SPADES; break;
        case 1: this.suit = suit.HEARTS; break;
        case 2: this.suit = suit.CLUBS; break;
        case 3: this.suit = suit.DIAMONDS; break; 
    }
    }
 
    public Value getValue(){
        return value;
    }

    /**
     * @param nr Valor Utilizado para identificar nº carta a ser setada.
     */
    public void setValue(int nr) {
        switch (nr){
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
