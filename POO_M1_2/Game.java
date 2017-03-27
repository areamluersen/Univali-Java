package br.univali.kob.poo1.aula03;

/**
 * Classe que roda o jogo.
 * 
 * @author Aream e Gustavo
 */
public class Game {

    /**
     * Default contructor.
     */
    public Game (){
    }
    
    /**
     * Método que roda o jogo.
     * 
     * @return pontuação do jogador no final do jogo.
     */
    public int jogar (){
        Deck deck = new Deck();
        UserInterface.iniciar();
        int num_player;
        int naipe_player;
        int chances;
        int pontos = 0;
        Boolean quer_jogar = true;
        Boolean ganhou;
        do{
            ganhou = false;
            chances = 3;
            deck.shuffle();
            do{       
                num_player = UserInterface.input(1);
                naipe_player = UserInterface.input(2);
                if (num_player == deck.getCard(0).getNumValue() && naipe_player == deck.getCard(0).getNumSuit()){
                    switch (chances){
                        case 3:
                            UserInterface.vitoria(500);
                            pontos = pontos + 500;
                            break;
                        case 2:
                            UserInterface.vitoria(200);
                            pontos = pontos + 200;
                            break;
                        case 1:
                            UserInterface.vitoria(50);
                            pontos = pontos + 50;
                            break;
                    }
                    UserInterface.mostrarCarta(deck.getCard(0).getDescriptionValue(), deck.getCard(0).getDescriptionSuit());
                    ganhou = true;
                    quer_jogar = UserInterface.jogarNovamente();
                }
                else{
                    chances--;
                    switch(chances){
                        case 2:
                            UserInterface.errou(chances);
                            UserInterface.dicaUm(deck.getCard(0).getDescriptionSuit());
                            break;
                        case 1:
                            UserInterface.errou(chances);
                            UserInterface.dicaDois(deck.getCard(0).getNumValue());
                            break;
                        case 0:
                            UserInterface.derrota();
                            UserInterface.mostrarCarta(deck.getCard(0).getDescriptionValue(), deck.getCard(0).getDescriptionSuit());
                            quer_jogar = UserInterface.jogarNovamente();
                            break;
                    }
                }
            }while(chances > 0 && !(ganhou));
        }while(quer_jogar);
        return pontos;
    }
    
}
