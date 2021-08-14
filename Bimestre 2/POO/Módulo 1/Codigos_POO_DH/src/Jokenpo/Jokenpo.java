package Jokenpo;

import java.util.Scanner;

public class Jokenpo {

    public static void ganhador(String nomeJogador1, String nomeJogador2, int pontosJogador1, int pontosJogador2) {
        if (pontosJogador1 > pontosJogador2 ) {
            System.out.println("O jogador " + nomeJogador1 + " ganhou a partida!");
            System.out.println("pontos do " + nomeJogador1 + ": " + pontosJogador1);
        } else if (pontosJogador2 > pontosJogador1) {
            System.out.println("O jogador " + nomeJogador2 + " ganhou a partida!");
            System.out.println("pontos do " + nomeJogador2 + ": " + pontosJogador2);
        } else {
            System.out.println("Empate técnico");
        }
    }

    public static void empate(String escolhaJogador1, String escolhaJogador2) {
        if (escolhaJogador1.equals(escolhaJogador2)) {
            System.out.println("Empate! Ninguem pontua");
        }
    }


    public static void jogar(String jogador1, String jogador2, Scanner scanner) {

        int pontosJogador1 = 0;
        int pontosJogador2 = 0;
        int numeroDePartidas = 0;
        String escolhaJogador1;
        String escolhaJogador2;

        while(numeroDePartidas < 3) {

            System.out.println(jogador1 + " faça a sua jogada: Pedra/Papel/Tesoura");
            escolhaJogador1 = scanner.nextLine().toLowerCase();

            System.out.println(jogador2 + " faça a sua jogada: Pedra/Papel/Tesoura");
            escolhaJogador2 = scanner.nextLine().toLowerCase();

            empate(escolhaJogador1,escolhaJogador2);

            switch(escolhaJogador1) {
                case "pedra":
                    if (escolhaJogador2.equals("tesoura")) {
                        pontosJogador1++;
                        System.out.println(jogador1 + " ganhou a rodada!");
                    }else {
                        pontosJogador2++;
                        System.out.println(jogador2 + " ganhou a rodada!");
                    }
                    break;
                case "papel":
                    if (escolhaJogador2.equals("pedra")) {
                        pontosJogador1++;
                        System.out.println(jogador1 + " ganhou a rodada!");
                    }else {
                        pontosJogador2++;
                        System.out.println(jogador2 + " ganhou a rodada!");
                    }
                    break;
                case "tesoura":
                    if (escolhaJogador2.equals("papel")) {
                        pontosJogador1++;
                        System.out.println(jogador1 + " ganhou a rodada!");
                    }else {
                        pontosJogador2++;
                        System.out.println(jogador2 + " ganhou a rodada!");
                    }
                    break;
            }
            numeroDePartidas++;
            ganhador(jogador1,jogador2,pontosJogador1, pontosJogador2);
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean decisaoBoolean = false;
        System.out.println("Nome do primeiro jogador: ");
        String jogador1 = scanner.nextLine();

        System.out.println("Nome do segundo jogador: ");
        String jogador2 = scanner.nextLine();

        do {
            System.out.println("Podemos começar? Y/N");
            String decisao = scanner.nextLine();
            if(decisao.toLowerCase().charAt(0) == 'y') {
                decisaoBoolean = true;
            }
        }while(!decisaoBoolean);

        jogar(jogador1,jogador2,scanner);
    }
}
