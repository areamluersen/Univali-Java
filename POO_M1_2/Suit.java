package br.univali.kob.poo1.aula03;

/**
 * Naipe da carta.
 * 
 * @author Aream e Gustavo.
 */
public enum Suit {
    SPADES("Espadas",1),
    HEARTS("Copas",2),
    CLUBS("Paus",3),
    DIAMONDS("Ouros",4);
    
    /**
     * Naipe da carta em forma de String.
     */
    private String description;
    
    /**
     * Naipe da carta em forma de int.
     */
    private int num;
   
    /**
     * Getter.
     * 
     * @return Naipe da carta em forma de String.
     */
    public String getDescription (){
        return description;
    }
    
    /**
     * Getter.
     * 
     * @return Naipe da carta em forma de int.
     */
    public int getNum (){
        return num;
    }
    
    /**
     * Construtor.
     * 
     * @param description Naipe da carta em forma de String.
     * @param num Naipe da carta em forma de int.
     */
    private Suit (String description, int num){
        this.description = description;
        this.num = num;
    }
    
}
