package br.univali.kob.poo1.aula03;

/**
 * 
 */
public enum Suit {
    SPADES("Espadas"),
    HEARTS("Copas"),
    CLUBS("Paus"),
    DIAMONDS("Ouros");
    
    private String description;
    
    public String getDescription (){
        return description;
    }
    
    private Suit (String description){
        this.description = description;
    }
    
}
