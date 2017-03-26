package br.univali.kob.poo1.aula03;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Aream e Gustavo
 */
public class Deck{
    
     /**
     * Default constructor Cria o Deck
     */
    public Deck(){
        int cont = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 13; j++){
                deck[cont] = new Carta(i,j);
                cont++;
            }
        }
    }
    
    /**
     * 
     */
    private Carta[] deck = new Carta[52];
    
    /**
     * Embaralha as 52 cartas criadas
     */
    public void shuffle() {
        Carta[] embaralhado = new Carta[52];
        List n = new ArrayList();
        Collections.shuffle(n);
        for(int i=0; i<51; i++){
            embaralhado[i] = deck[n];
        }
        deck = embaralhado;
    }

    /**
     * @param id Posição da carta em relação ao baralho (0 a 51)
     * @return Carta que estiver na posição especificada
     */
    public Carta getCard(int id){
        return deck[id];
    }

    /**
     *  @return Vertor com todas as cartas
     */
    public Carta[] getAll() {
        return deck;
    }

}
