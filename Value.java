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
    JACK("Valete",11),
    QUEEN("Rainha",11),
    KING("Rei",13);

    private String description;

    private int numCarta;
    

    public String getDescription (){
        return description;
    }
    
    public int getNum (){
        return numCarta;
    }
    
    private Value (String description, int valorCarta){
        this.numCarta = valorCarta;
        this.description = description;
    }
    
}