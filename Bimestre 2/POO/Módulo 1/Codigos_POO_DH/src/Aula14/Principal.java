package Aula14;

public class Principal {
    public static void main(String[] args) {
        Jogador nelson = new Jogador("Nelson", 1, false, false);
        Jogador rodrigo = new Jogador("Rodrigo", 2, true, true);
        Jogador david = new Jogador("David", 0, true, true);
        Equipe turma03 = new Equipe("Turma 03");

        turma03.addJogador(nelson);
        turma03.addJogador(rodrigo);
        turma03.addJogador(david);
    //    turma03.mostrarJogadoresTitulares();
        System.out.println(turma03.getQuantidadeJogadoresLesionados());
    }
}
