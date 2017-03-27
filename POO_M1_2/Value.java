package br.univali.kob.poo1.aula03;

/**
 * Número da carta.
 * 
 * @author Aream e Gustavo.
 */
public enum Value {
    A("A",1),
    DOIS("Dois",2),
    TRES("Tres",3),
    QUATRO("Quatro",4),
    CINCO("Cinco",5),
    SEIS("Seis",6),
    SETE("Sete",7),
    OITO("Oito",8),
    NOVE("Nove",9),
    DEZ("Dez",10),
    JACK("Valete",11),
    QUEEN("Rainha",12),
    KING("Rei",13);

    /**
     * Número da carta em forma de String.
     */
    private String description;

    /**
     * Número da carta em forma de int.
     */
    private int num;

    /**
     * Getter.
     * 
     * @return Número da carta em forma de String.
     */
    public String getDescription (){
        return description;
    }
    
    /**
     * Getter.
     * 
     * @return Número da carta em forma de int.
     */
    public int getNum (){
        return num;
    }
    
    /**
     * Contrutor.
     * 
     * @param description Número da carta em forma de String.
     * @param num Número da carta em forma de int.
     */
    private Value (String description, int num){
        this.num = num;
        this.description = description;
    }
    
}