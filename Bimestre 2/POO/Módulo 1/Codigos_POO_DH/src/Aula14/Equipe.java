package Aula14;

import java.util.ArrayList;
import java.util.List;


public class Equipe {

    private String nome;
    private List<Jogador> listajogadores = new ArrayList<>();

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void addJogador(Jogador jogador){
        this.listajogadores.add(jogador);
    }

    public void mostrarJogadoresTitulares(){
        listajogadores.sort((jogador1, jogador2) -> jogador1.compareTo(jogador2));
        for (Jogador jogador: listajogadores){
            if (jogador.isTitular()){
                System.out.println(jogador.getNome());

            }
        }
    }

    public int getQuantidadeJogadoresLesionados(){
        int contador = 0;
        for (Jogador jogador: listajogadores){
            if (jogador.isLesionado() && jogador.isTitular()){
                contador++;

            }
        }
        return contador;
    }

}
