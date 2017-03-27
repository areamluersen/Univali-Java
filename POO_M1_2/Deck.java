package br.univali.kob.poo1.aula03;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe que contém 52 objetos 'Carta'.
 * 
 * @author Aream e Gustavo.
 */
public class Deck{
    
    /**
     * Default constructor que cria os 52 objetos 'Carta' e atribui os valores e naipes.
     */
    public Deck (){
        int cont = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 13; j++){
                deck[cont] = new Carta (i,j);
                cont++;
            }
        }
    }
    
    /**
     * Vetor que contém 52 objetos 'Carta'.
     */
    private Carta[] deck = new Carta[52];
        
    /**
     * Embaralha as 52 cartas do deck.
     */
    public void shuffle (){
        Carta[] embaralhado = new Carta[52];
        List<Integer> posicoes_aleatorias = new ArrayList<Integer> ();
        for (int i = 0; i < 52; i++)
            posicoes_aleatorias.add (i);
        Collections.shuffle (posicoes_aleatorias);
        for(int i=0; i<52; i++)
            embaralhado[i] = deck[posicoes_aleatorias.get (i)];
        deck = embaralhado;
    }

    /**
     * Getter.
     * 
     * @param id Posição da carta em relação ao baralho (0 a 51).
     * @return Objeto 'Carta' que estiver na posição especificada.
     */
    public Carta getCard (int id){
        return deck[id];
    }

    /**
     * Getter.
     * 
     * @return Vetor com todas as cartas.
     */
    public Carta[] getAll () {
        return deck;
    }

}
