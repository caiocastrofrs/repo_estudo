package ExercicioAula06;


public class Principal {
    public static void main(String[] args) {
        Adocao cachorro = new Adocao("shesheu",1920,"yorkshire",4.20);
        Adocao cachorro2 = new Adocao("shesheu2",1930,"yorkshire",5.10, false, true);
        System.out.println();
        System.out.println(cachorro.getIdadeCachorro());
        System.out.println(cachorro.isEstaFerido());
        System.out.println(cachorro.isPossuiChip());
        System.out.println(cachorro.isAptoParaAdocao());
    }
}
