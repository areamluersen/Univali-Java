package br.univali.kob.poo1.aula03;

/**
 * 
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
    JACK("Jack",11),
    QUEEN("Queen",11),
    KING("King",13);

    private int valorCarta;
    private String description;
    
    private Value (String description, int valorCarta){
        this.valorCarta = valorCarta;
        this.description = description;
    }
    public int getValue (){
        return valorCarta;
    }
    public String getDescription (){
        return description;
    }
}