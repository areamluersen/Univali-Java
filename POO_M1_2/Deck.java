package br.univali.kob.poo1.aula03;
import java.util.Random;

/**
 *
 * @author Aream e Gustavo
 */
public class Deck{
     /**
     * Default constructor Cria o Deck
     */
    public Deck(){
        
        //acho q essa linha não precisa, pois as cartas sao instanciadas uma por uma dentro do for
        //deck = new Carta[52];
        
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
    private Carta[] deck;
    
    /**
     * Embaralha as 52 cartas criadas
     */
    public void shuffle() {
        Random rand = new Random();
        Carta[] embaralhado = new Carta[52];
        int cont=0;
        do{
            int n = rand.nextInt(51);
            if(embaralhado[n] == null){
                embaralhado[n] = deck[cont];
                cont++;
            }
        }while(cont < 52);
        deck = embaralhado;
    }

    /**
     * @param id Posição da carta em relação ao baralho (0 a 51)
     * @return Carta que estiver na posição especificada
     */
    
    //pelas instruçoes o professor quer que seja 'public Carta getCard()', nao string
    
    public Carta getCard(int id){
        
        //return deck[id-1].getValue().getDescription();
        
        //id de 0 a 51
        
        return deck[id];
    }

    /**
     *  @return Vertor com todas as cartas
     */
    
    //pelas instruçoes o professor quer que seja 'public Carta[] getAll()', nao void - retornar, nao printar
    
    public Carta[] getAll() {
        return deck;
    }

}
