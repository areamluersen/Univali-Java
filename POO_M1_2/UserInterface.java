package br.univali.kob.poo1.aula03;

import java.util.Scanner;

/**
 * Classe que faz todas as operações de entrada e saída do programa.
 * 
 * @author Aream e Gustavo
 */
public abstract class UserInterface {
    
    /**
     * Imprime as informações de como jogar no terminal.
     */
    public static void iniciar (){
        System.out.println ("VOCÊ QUER JOGAR UM JOGO?\n");
        System.out.println ("Números:\n1)A\n2)Dois\n3)Tres\n4)Quatro\n.\n.\n.\n11)Valete\n12)Rainha\n13)Rei\n");
        System.out.println ("Naipes:\n1)Espadas\n2)Copas\n3)Paus\n4)Ouros\n");
    }
    
    /**
     * Pega o nome do jogador do terminal.
     * 
     * @return 
     */
    public static String inputNome (){
        System.out.println ("Digite o nome do jogador:");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        return nome;
    }
    
    /**
     * Imprime o nome e pontuação do jogador no terminal.
     * 
     * @param nome
     * @param pontos 
     */
    public static void pontosDoJogador (String nome, int pontos){
        System.out.println ("\n" + nome + ": " + pontos + ".");
    }
    
    /**
     * Imprime o naipe da carta no terminal.
     * 
     * @param naipe Naipe da carta.
     */
    public static void dicaUm (String naipe){
        System.out.println ("O naipe é: " + naipe + "\n");
    }
    
    /**
     * Imprime uma informação sobre a carta no terminal.
     * 
     * @param num Número da carta.
     */
    public static void dicaDois (int num){
        if (num >= 7){
            System.out.println ("O número da carta é maior ou igual a 7\n");
        }
        else{
            System.out.println ("O número da carta é menor do que 7\n");
        }
    }
    
    /**
     * Imprime a informação que o jogador ganhou, e os pontos recebidos pela vitória.
     * 
     * @param pontos 
     */
    public static void vitoria (int pontos){
        System.out.println("\nParabéns, você acertou!\nganhou " + pontos + " pontos.");
    }
    
    /**
     * Imprime a informação que o jogador errou, e o quanto lhe resta de tentativas.
     * 
     * @param chances 
     */
    public static void errou (int chances){
        System.out.println ("\nVocê errou, faltam " + chances + " tentativas.");
    }
    
    /**
     * Imprime a informação que o jogador perdeu.
     */
    public static void derrota (){
        System.out.println ("\nVocê é burro, você perdeu...\n");
    }
    
    /**
     * Pergunta para o jogador se ele deseja jogar novamente.
     * 
     * @return True se o jogador quiser continuar jogando e false se o jogador não quiser mais jogar.
     */
    public static Boolean jogarNovamente (){
        System.out.println ("Você deseja jogar novamente? (s/n):");
        Scanner reader = new Scanner(System.in);
        char c = reader.next().charAt(0);
        if (c == 's')
            return true;
        else
            return false;
    }
    
    /**
     * Mostra qual é o valor da carta.
     * 
     * @param num Número da carta.
     * @param naipe Naipe da carta.
     */
    public static void mostrarCarta (String num, String naipe){
        System.out.println ("A carta era: " + num + " de " + naipe +"\n");
    }
    
    /**
     * Pega o número e naipe da carta que o jogador escolher do terminal.
     * 
     * @param op Caso seja 1, pegar o número da carta; e se for outro, pegar o naipe da carta.
     * @return Número da carta ou naipe da carta.
     */
    public static int input (int op){
        int i;
        if (op == 1){
            System.out.println("Digite o número da carta escolhida: ");
            do{
                Scanner sc = new Scanner(System.in);
                i = sc.nextInt();
            }while(!(i > 0 && i < 14));
        }
        else{
            System.out.println ("Digite o naipe da carta escolhida: ");
            do{
                Scanner sc = new Scanner(System.in);
                i = sc.nextInt();
            }while(!(i > 0 && i < 5));
        }
        return i;
    }
    
}
